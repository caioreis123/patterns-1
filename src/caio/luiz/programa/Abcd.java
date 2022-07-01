package caio.luiz.programa;

import caio.luiz.exercicio.GruposMusculares;
import caio.luiz.exercicio.TipoExercicio;

import java.time.DayOfWeek;

public class Abcd extends Status {
    public Abcd(Programa programa) {
        super(programa);
        this.diasDeRepouso.add(DayOfWeek.FRIDAY);
        this.diasDeRepouso.add(DayOfWeek.SATURDAY);
        this.diasDeRepouso.add(DayOfWeek.SUNDAY);

        adicionaSeriesDeAcordoComDia();
    }

    private void adicionaSeriesDeAcordoComDia() {
        switch (programa.getHoje()) {
            case MONDAY -> super.criaSeries(GruposMusculares.OMBROS_ABODOMINAL, TipoExercicio.FUNCIONAL);
            case TUESDAY -> super.criaSeries(GruposMusculares.MEMBROS_INFERIORES, TipoExercicio.CARDIOVASCULAR);
            case WEDNESDAY -> super.criaSeries(GruposMusculares.PEITORAL_TRICEPS, TipoExercicio.RESISTIDO);
            case THURSDAY -> super.criaSeries(GruposMusculares.COSTA_BICEPS, TipoExercicio.MOBILIDADE);
        }
    }

}
