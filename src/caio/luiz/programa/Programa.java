package caio.luiz.programa;

import caio.luiz.observador.Interessado;
import caio.luiz.serie.Serie;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import static caio.luiz.programa.TipoPrograma.*;

public class Programa {
    public static Status status;
    private DayOfWeek hoje;

    public TipoPrograma tipoPrograma;

    public Programa(){
        hoje = LocalDateTime.now().getDayOfWeek();
//        hoje = DayOfWeek.THURSDAY;
//        hoje = DayOfWeek.MONDAY;
    }

    public void setTipo(TipoPrograma tipoPrograma) {
        this.tipoPrograma = tipoPrograma;
        switch (tipoPrograma) {
            case FULL_WORKOUT -> status = new FullWorkout(this);
            case ABCD -> status = new Abcd(this);
            case CARDIO -> status = new Cardio(this);
        }
    }

    public void init() {

    }

    public boolean temProximo() {
        return status.temProximo();
    }

    public Serie proximo() {
        return status.proximo();
    }

    public DayOfWeek getHoje() {
        return hoje;
    }

    public void addInteressado(Interessado interessado) {
        status.addInteressado(interessado);
    }
}
