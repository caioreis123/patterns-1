package caio.luiz.exercicio;

import caio.luiz.equipamento.Equipamento;

import java.util.ArrayList;

public class Exercicio {
    String nome;
    ArrayList<TipoExercicio> tipoExercicios;
    ArrayList<GruposMusculares> gruposMusculares;
    ArrayList<Equipamento> equipamentos;

    protected Exercicio(String nome, ArrayList<TipoExercicio> tipoExercicios, ArrayList<GruposMusculares> gruposMusculares, ArrayList<Equipamento> equipamentos) {
        this.nome = nome;
        this.tipoExercicios = tipoExercicios;
        this.gruposMusculares = gruposMusculares;
        this.equipamentos = equipamentos;
    }
    public String toString() {
        return "Exercicio{" + "nome=" + nome + ", tipoExercicios=" + tipoExercicios + ", gruposMusculares=" + gruposMusculares + ", equipamentos=" + equipamentos + '}';
    }

    public String getNome() {
        return nome;
    }
}
