package caio.luiz.equipamento;

public class Acessorios extends Equipamento {

    public String descricao;

    public Acessorios(){}

    public Acessorios(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
        this.descricao = "Acessório de corda fortão";
    }
}
