package caio.luiz;

public class Maquinas extends Equipamento{

    public String descricao;
    public String marca;

    public Maquinas(){}

    public Maquinas(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
        this.descricao = "Máquina de Supino em alta";
        this.marca = "Nike";
    }
}
