package caio.luiz.programa;

import caio.luiz.exercicio.GruposMusculares;
import caio.luiz.exercicio.TipoExercicio;
import caio.luiz.serie.Serie;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

import static caio.luiz.ProvaUm.getExercicio;

public abstract class Status {
    public Serie proximaSerie;
    public Stack<Serie> series = new Stack<>();
    ArrayList<DayOfWeek> diasDeRepouso = new ArrayList<>();

    public Programa programa;
    public Status( Programa programa ) {
        this.programa = programa;
    }
    public boolean temProximo() {
        if(diasDeRepouso.contains(programa.getHoje())) {
            System.out.println("Hoje é dia de repouso");
            return false;
        }
        try{
            this.proximaSerie = series.pop();
            return true;
        }
        catch (EmptyStackException e) {
            System.out.println("Não há mais series para hoje");
            return false;
        }
        }

    public Serie proximo(){
        return this.proximaSerie;
    }

    protected void criaSeries(GruposMusculares grupoMuscular, TipoExercicio tipoExercicio) {
        Serie serie1 = new Serie(3, 15, getExercicio(grupoMuscular, tipoExercicio));
        Serie serie2 = new Serie(2, 30, getExercicio(grupoMuscular, tipoExercicio));
        this.series.push(serie1);
        this.series.push(serie2);
    }
}
