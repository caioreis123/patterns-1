package caio.luiz;

import java.io.FileInputStream;
import java.io.IOException;
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

    abstract public Equipamento retornarEquipamentoDoCatalogo(String identificador, int quantidade);

    public static Equipamento criarEquipamento(String tipoDeEquipamento, String identificador, int quantidade){
        try {
            String nomeDaClasse = pegarNomeDaClasse(tipoDeEquipamento);
            Class<?> classeConcretaDeEquipamento = Class.forName("caio.luiz."+nomeDaClasse);
            Object instanciaSimplesDeEquipamento = classeConcretaDeEquipamento.newInstance();
            Method metodoRetornarEquipamentoDoCatalogo = classeConcretaDeEquipamento.getMethod("retornarEquipamentoDoCatalogo", String.class, int.class);
            Equipamento equipamentoConcreto = (Equipamento) metodoRetornarEquipamentoDoCatalogo.invoke(instanciaSimplesDeEquipamento, identificador, quantidade);


            System.out.println(classeConcretaDeEquipamento);
            return equipamentoConcreto;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String pegarNomeDaClasse(String tipoDeEquipamento) throws IOException {
        String rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
        String appConfigPath = rootPath + "app.properties";
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        String className = appProps.getProperty(tipoDeEquipamento);
        return className;
    }
}
