package caio.luiz.equipamento;

public class Maquinas extends Equipamento {

    public String descricao;
    public String marca;

    private Maquinas(){}

    private Maquinas(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
        this.descricao = "Máquina de Supino em alta";
        this.marca = "Nike";
    }
}
