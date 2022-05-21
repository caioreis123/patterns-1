package caio.luiz.questao1;

import caio.luiz.Equipamento;
import caio.luiz.Halteres;

public class Questao1 {
//    tanto o tipoDeEquipamento será a chave e identificador um valor, lidos de um arquivo de configuracao properties
    public static Equipamento criarEquipamento(String tipoDeEquipamento, String identificador, int quantidade){
//        equipamentos de mesmo tipo podem ter identificadores diferentes
//        quando o identificador solicitado for igual a um existente, deve-se apenas atualizar sua quantidade, em vez de criar uma nova instancia
        return new Halteres(identificador, quantidade);
    }
}
