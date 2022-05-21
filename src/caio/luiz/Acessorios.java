package caio.luiz;

public class Acessorios extends Equipamento{
    public String descricao;
    public Acessorios(){}
    private Acessorios(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
        this.descricao = "Acessório de corda fortão";
    }

    public Acessorios retornarEquipamentoDoCatalogo(String identificador, int quantidade){
        if(catalogo.containsKey(identificador)){
            Acessorios equipamento = (Acessorios) catalogo.get(identificador);
            equipamento.atualizaQuantidade(quantidade);
            return equipamento;
        }
        Acessorios equipamento = new Acessorios(identificador, quantidade);
        catalogo.put(identificador, equipamento);
        return equipamento;
    }
}
