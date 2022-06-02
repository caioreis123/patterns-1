package caio.luiz;

import caio.luiz.equipamento.Equipamento;
import caio.luiz.exercicio.Exercicio;
import caio.luiz.exercicio.ExercicioBuilder;
import caio.luiz.exercicio.TipoExercicio;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        questao1();
        questao2();
    }

    private static void questao2() {
        Equipamento equipamento1 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornaEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento3 = Equipamento.retornaEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);

        ExercicioBuilder builder = new ExercicioBuilder();
        builder.novoExercicio("malha costas");
        builder.adicionarEquipamentos(new ArrayList<>(Arrays.asList(equipamento1, equipamento2, equipamento3)));
        builder.adicionarTiposDeExercicio(new ArrayList<>(Arrays.asList(TipoExercicio.MOBILIDADE, TipoExercicio.CARDIOVASCULAR)));;
        builder.adicionarGruposMusculares(new ArrayList<>(Arrays.asList("costas", "peito", "abdomen", "biceps")));
        Exercicio exercicio = builder.pegaExercicio();
        System.out.println(exercicio);
    }

    private static void questao1() {
        Equipamento equipamento1 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 22);
        Equipamento equipamento3 = Equipamento.retornaEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento4 = Equipamento.retornaEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);
        System.out.println("Equipamentos de mesmo identificador sao iguais? " + equipamento1.equals(equipamento2));
        System.out.println("Equipamentos de identificadores diferentes sao iguais? " + equipamento3.equals(equipamento4));
    }
}
