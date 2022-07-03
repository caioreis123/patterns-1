package caio.luiz;

import caio.luiz.equipamento.Equipamento;
import caio.luiz.exercicio.Exercicio;
import caio.luiz.exercicio.ExercicioBuilder;
import caio.luiz.exercicio.GruposMusculares;
import caio.luiz.exercicio.TipoExercicio;

public class ProvaUm {
    public static void questao1() {
        System.out.println("\nQuestao 1: ");
        Equipamento equipamento1 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 22);
        Equipamento equipamento3 = Equipamento.retornaEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento4 = Equipamento.retornaEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);

        System.out.println("Equipamentos de mesmo identificador sao iguais? " + equipamento1.equals(equipamento2));
        System.out.println("Equipamentos de identificadores diferentes sao iguais? " + equipamento3.equals(equipamento4));
    }

    public static void questao2() {
        System.out.println("\nQuestao 2: ");
        Exercicio exercicio = getExercicio(GruposMusculares.OMBROS_ABODOMINAL, TipoExercicio.CARDIOVASCULAR);
        System.out.println(exercicio);
    }

    public static Exercicio getExercicio(GruposMusculares grupoMuscular, TipoExercicio tipoExercicio) {
        Equipamento equipamento1 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornaEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento3 = Equipamento.retornaEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);

        ExercicioBuilder builder = new ExercicioBuilder();
        Exercicio exercicio = builder
                .adicionarEquipamento(equipamento1)
                .adicionarEquipamento(equipamento2)
                .adicionarEquipamento(equipamento3)

                .adicionarTipoDeExercicio(tipoExercicio)

                .adicionarGrupoMuscular(grupoMuscular)

                .pegaExercicio(grupoMuscular.toString());

        return exercicio;
    }
}
