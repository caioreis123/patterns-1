package caio.luiz.exercicioCombinado;

import caio.luiz.exercicio.Exercicio;

import java.util.ArrayList;

public class ExercicioCombinado {
    public ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

    public ExercicioCombinado(){}

    public ExercicioCombinado(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public void adicionarExercicio(Exercicio exercicio) {
        this.exercicios.add(exercicio);
    }
}
