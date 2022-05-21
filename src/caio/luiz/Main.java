package caio.luiz;

public class Main {

    public static void main(String[] args) {
        Equipamento equipamento1 = Equipamento.criarEquipamento("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.criarEquipamento("maquinas", "identificadorX", 20);
        Equipamento equipamento3 = Equipamento.criarEquipamento("halteres", "identificadorY", 20);
        Equipamento equipamento4 = Equipamento.criarEquipamento("acessorios", "identificadorZ", 99);

        System.out.println("quantidade no colecao: " + Equipamento.catalogo.size());
    }
}
