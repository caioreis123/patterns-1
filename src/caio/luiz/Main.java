package caio.luiz;

import java.lang.reflect.Array;
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
        builder.reset();
        builder.adicionarEquipamentos(new ArrayList<>(Arrays.asList(equipamento1, equipamento2, equipamento3)));
//        todo: fazer o nome obrigatorio
        builder.adicionarTipoExercicios(new ArrayList<TipoExercicio>(Arrays.asList(TipoExercicio.MOBILIDADE, TipoExercicio.CARDIOVASCULAR)));;
        builder.adicionarGruposMusculares(new ArrayList<String>(Arrays.asList("costas", "peito", "abdomen", "biceps")));
        Exercicio exercicio = builder.pegaExercicio("malha costas");
        System.out.println(exercicio);
    }

    private static void questao1() {
        Equipamento equipamento1 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 13);
        Equipamento equipamento2 = Equipamento.retornaEquipamentoDoCatalogo("maquinas", "identificadorX", 22);
        Equipamento equipamento3 = Equipamento.retornaEquipamentoDoCatalogo("halteres", "identificadorY", 20);
        Equipamento equipamento4 = Equipamento.retornaEquipamentoDoCatalogo("acessorios", "identificadorZ", 99);
        System.out.println("quantidade no colecao: " + Equipamento.catalogo.size());
    }
}
