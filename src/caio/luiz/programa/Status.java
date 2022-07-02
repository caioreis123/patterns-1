package caio.luiz.programa;

import caio.luiz.exercicio.GruposMusculares;
import caio.luiz.exercicio.TipoExercicio;
import caio.luiz.observador.EstadoDeFim;
import caio.luiz.observador.Interessado;
import caio.luiz.serie.Serie;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

import static caio.luiz.ProvaUm.getExercicio;

public abstract class Status {

    public ArrayList<Interessado> interessados = new ArrayList<>();
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
            notificaInteressados();
            return false;
        }
        }

    public Serie proximo(){
        return this.proximaSerie;
    }

    protected void criaSeries(GruposMusculares grupoMuscular, TipoExercicio tipoExercicio) {
        Serie serie1 = new Serie(3, 15, getExercicio(grupoMuscular, tipoExercicio));
        Serie serie2 = new Serie(3, 15, getExercicio(grupoMuscular, tipoExercicio));
        Serie serie3 = new Serie(3, 16, getExercicio(grupoMuscular, tipoExercicio));
        this.series.push(serie1);
        this.series.push(serie2);
        this.series.push(serie3);
    }

    public void addInteressado(Interessado interessado) {
        this.interessados.add(interessado);
    }

    public void notificaInteressados() {
        EstadoDeFim estadoDeFim = new EstadoDeFim(LocalDateTime.now(), programa.tipoPrograma);
        for (Interessado interessado : interessados) {
            interessado.notifica(estadoDeFim);
        }
    }
}
