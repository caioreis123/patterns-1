package caio.luiz;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public abstract class Equipamento {

    public String identificador;
    public int quantidade;
    public static HashMap<String, Equipamento> catalogo = new HashMap<String, Equipamento>();

    public void atualizaQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public static Equipamento retornarEquipamentoDoCatalogo(String tipoDeEquipamento, String identificador, int quantidade){
        if(catalogo.containsKey(identificador)){
            Equipamento equipamento = catalogo.get(identificador);
            equipamento.atualizaQuantidade(quantidade);
            return equipamento;
        }
        Equipamento equipamento = criarEquipamento(tipoDeEquipamento, identificador, quantidade);
        catalogo.put(identificador, equipamento);
        return equipamento;
    };

    /**
     * Utiliza reflexão para obter o equipamento concreto desejado
     * @param tipoDeEquipamento
     * @param identificador
     * @param quantidade
     * @return Equipamento
     */
    private static Equipamento criarEquipamento(String tipoDeEquipamento, String identificador, int quantidade){
        try {
            String nomeDaClasse = pegarNomeDaClasse(tipoDeEquipamento);
            Class<?> classeConcretaDeEquipamento = Class.forName("caio.luiz."+nomeDaClasse);
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
