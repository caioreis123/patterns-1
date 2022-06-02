package caio.luiz.equipamento;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public abstract class Equipamento {

    protected String identificador;
    protected int quantidade;
    private static HashMap<String, Equipamento> catalogo = new HashMap<String, Equipamento>();

    private void atualizaQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    /**
     * Método utilizado pelo cliente e que inicia o processo de criação e catalogaçao de equipamentos
     * @param tipoDeEquipamento
     * @param identificador
     * @param quantidade
     * @return Equipamento
     */
    public static Equipamento retornaEquipamentoDoCatalogo(String tipoDeEquipamento, String identificador, int quantidade){
        if(catalogo.containsKey(identificador)){
            Equipamento equipamento = catalogo.get(identificador);
            equipamento.atualizaQuantidade(quantidade);
            return equipamento;
        }
        Equipamento equipamento = criarEquipamentoNovo(tipoDeEquipamento, identificador, quantidade);
        catalogo.put(identificador, equipamento);
        return equipamento;
    };

    /**
     * Utiliza reflexão para criar um equipamento concreto novo
     * @param tipoDeEquipamento
     * @param identificador
     * @param quantidade
     * @return Equipamento
     */
    private static Equipamento criarEquipamentoNovo(String tipoDeEquipamento, String identificador, int quantidade){
        try {
            String nomeDaClasse = pegarNomeDaClasse(tipoDeEquipamento);
            Class<?> classeConcretaDeEquipamento = Class.forName(nomeDaClasse);
            Constructor<?> constructor = classeConcretaDeEquipamento.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            Object equipamento = constructor.newInstance(identificador, quantidade);
            return (Equipamento) equipamento;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Utiliza Properties para ler arquivo com os equipamentos disponíveis e suas respectivas classes
     * @param tipoDeEquipamento
     * @return String
     * @throws IOException
     */
    private static String pegarNomeDaClasse(String tipoDeEquipamento) throws IOException {
        String rootPath = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        String appConfigPath = rootPath + fileSeparator + "src" + fileSeparator + "app.properties";
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        String className = appProps.getProperty(tipoDeEquipamento);
        return className;
    }

    public String toString(){
        return this.getClass().getSimpleName() + ": " + identificador + " - " + quantidade + " unidades";
    }
}
