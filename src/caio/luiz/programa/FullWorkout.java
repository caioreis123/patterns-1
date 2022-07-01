package caio.luiz.programa;

import caio.luiz.exercicio.GruposMusculares;
import caio.luiz.exercicio.TipoExercicio;

import java.time.DayOfWeek;

public class FullWorkout extends Status{
    public FullWorkout(Programa programa) {
        super(programa);
        this.diasDeRepouso.add(DayOfWeek.TUESDAY);
        this.diasDeRepouso.add(DayOfWeek.THURSDAY);
        this.diasDeRepouso.add(DayOfWeek.SATURDAY);
        this.diasDeRepouso.add(DayOfWeek.SUNDAY);

        super.criaSeries(GruposMusculares.OMBROS_ABODOMINAL, TipoExercicio.CARDIOVASCULAR);
        super.criaSeries(GruposMusculares.MEMBROS_INFERIORES, TipoExercicio.MOBILIDADE);
        super.criaSeries(GruposMusculares.PEITORAL_TRICEPS, TipoExercicio.FUNCIONAL);
        super.criaSeries(GruposMusculares.COSTA_BICEPS, TipoExercicio.RESISTIDO);
    }


}
