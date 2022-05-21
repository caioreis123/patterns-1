package caio.luiz;

public class Halteres extends Equipamento {
    public double peso;

    private Halteres(String identificador, int quantidade){
        this.peso = 5;
        this.identificador = identificador;
        this.quantidade = quantidade;
    }

    public Halteres(){}

    public Halteres retornarEquipamentoDoCatalogo(String identificador, int quantidade){
        if(catalogo.containsKey(identificador)){
            Halteres equipamento = (Halteres) catalogo.get(identificador);
            equipamento.atualizaQuantidade(quantidade);
            return equipamento;
        }
        Halteres equipamento = new Halteres(identificador, quantidade);
        catalogo.put(identificador, equipamento);
        return equipamento;
    }
}
