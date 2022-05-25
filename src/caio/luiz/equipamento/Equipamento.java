package caio.luiz.equipamento;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public abstract class Equipamento {

    public String identificador;
    public int quantidade;
    public static HashMap<String, Equipamento> catalogo = new HashMap<String, Equipamento>();

    private void atualizaQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    /**
     * Método utilizado pelo cliente e que inicia todo o processo de criação e catalogaçao de equipamentos
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
            Constructor<?> constructor = classeConcretaDeEquipamento.getConstructor(String.class, int.class);
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
        String rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
        String appConfigPath = rootPath + "app.properties";
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        String className = appProps.getProperty(tipoDeEquipamento);
        return className;
    }
}
