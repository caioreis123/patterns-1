package caio.luiz;

public class Maquinas extends Equipamento{

    public String descricao;
    public String marca;

    public Maquinas(){}

    private Maquinas(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
        this.descricao = "Máquina de Supino em alta";
        this.marca = "Nike";
    }

    public Equipamento retornarEquipamentoDoCatalogo(String identificador, int quantidade){
        if(catalogo.containsKey(identificador)){
            Maquinas equipamento = (Maquinas) catalogo.get(identificador);
            equipamento.atualizaQuantidade(quantidade);
            return equipamento;
        }
        Maquinas equipamento = new Maquinas(identificador, quantidade);
        catalogo.put(identificador, equipamento);
        return equipamento;
    }
}
