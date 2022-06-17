package caio.luiz;

import caio.luiz.equipamento.Equipamento;
import caio.luiz.exercicio.Exercicio;
import caio.luiz.exercicio.ExercicioBuilder;
import caio.luiz.exercicio.TipoExercicio;

public class Main {

    public static void main(String[] args) {
        questao1();
        questao2();
    }

    private static void questao1() {
        System.out.println("\nQuestao 1: ");
        Equipamento equipamento1 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 22);
        Equipamento equipamento3 = Equipamento.retornaEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento4 = Equipamento.retornaEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);

        System.out.println("Equipamentos de mesmo identificador sao iguais? " + equipamento1.equals(equipamento2));
        System.out.println("Equipamentos de identificadores diferentes sao iguais? " + equipamento3.equals(equipamento4));
    }

    private static void questao2() {
        System.out.println("\nQuestao 2: ");
        Equipamento equipamento1 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornaEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento3 = Equipamento.retornaEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);

        ExercicioBuilder builder = new ExercicioBuilder();
        builder.adicionarEquipamento(equipamento1);
        builder.adicionarEquipamento(equipamento2);
        builder.adicionarEquipamento(equipamento3);

        builder.adicionarTipoDeExercicio(TipoExercicio.MOBILIDADE);;
        builder.adicionarTipoDeExercicio(TipoExercicio.CARDIOVASCULAR);;

        builder.adicionarGrupoMuscular("costas");
        builder.adicionarGrupoMuscular("peito");
        builder.adicionarGrupoMuscular("abdomem");
        builder.adicionarGrupoMuscular("biceps");

        Exercicio exercicio = builder.pegaExercicio("malha costas");

        System.out.println(exercicio);
    }
}
