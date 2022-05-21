package caio.luiz;

import java.util.ArrayList;

public class Exercicio {
    String nome;
    ArrayList<TipoExercicio> tipoExercicios;
    ArrayList<String> gruposMusculares;
    ArrayList<Equipamento> equipamentos;

    public Exercicio(String nome, ArrayList<TipoExercicio> tipoExercicios, ArrayList<String> gruposMusculares, ArrayList<Equipamento> equipamentos) {
        this.nome = nome;
        this.tipoExercicios = tipoExercicios;
        this.gruposMusculares = gruposMusculares;
        this.equipamentos = equipamentos;
    }
}
