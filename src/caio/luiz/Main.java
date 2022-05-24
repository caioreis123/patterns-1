package caio.luiz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        questao1();
//        questao2();
    }

    private static void questao2() {
        ExercicioBuilder builder = new ExercicioBuilder();
        builder.reset();
        Equipamento equipamento1 = Equipamento.retornarEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
        equipamentos.add(equipamento1);
        builder.adicionarEquipamentos(equipamentos);
        builder.adicionarNome("malha costas");
        Exercicio exercicio = builder.pegaExercicio();
        System.out.println(exercicio);
    }

    private static void questao1() {
        Equipamento equipamento1 = Equipamento.retornarEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornarEquipamentoDoCatalogo("maquinas", "identificadorX", 20);
        Equipamento equipamento3 = Equipamento.retornarEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento4 = Equipamento.retornarEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);
        System.out.println("quantidade no colecao: " + Equipamento.catalogo.size());
    }
}
