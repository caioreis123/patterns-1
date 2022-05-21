package caio.luiz.questao1;

import caio.luiz.Equipamento;
import caio.luiz.Halteres;

import java.io.FileInputStream;
import java.util.Properties;

public class Questao1 {
//    tipoDeEquipamento será a chave e identificador um valor, lidos de um arquivo de configuracao properties
    public static Equipamento criarEquipamento(String tipoDeEquipamento, String identificador, int quantidade){
//        equipamentos de mesmo tipo podem ter identificadores diferentes
//        quando o identificador solicitado for igual a um existente, deve-se apenas atualizar sua quantidade, em vez de criar uma nova instancia
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "app.properties";
        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
            String className = appProps.getProperty(tipoDeEquipamento);
            Class<?> c = Class.forName("caio.luiz."+className);
            Object equipamento = c.getDeclaredConstructor(String.class, int.class).newInstance(identificador, quantidade);
            System.out.println(c);
            return (Equipamento) equipamento;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
}
