package caio.luiz.equipamento;

public class Acessorios extends Equipamento {

    private String descricao;

    private Acessorios(){}

    private Acessorios(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
        this.descricao = "Acessório de corda fortão";
    }
}
