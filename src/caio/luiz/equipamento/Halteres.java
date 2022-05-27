package caio.luiz.equipamento;

public class Halteres extends Equipamento {

    private double peso;

    private Halteres(){}

    private Halteres(String identificador, int quantidade){
        this.peso = 5;
        this.identificador = identificador;
        this.quantidade = quantidade;
    }
}
