package caio.luiz.equipamento;

public class Halteres extends Equipamento {

    public double peso;

    public Halteres(String identificador, int quantidade){
        this.peso = 5;
        this.identificador = identificador;
        this.quantidade = quantidade;
    }

    public Halteres(){}
}
