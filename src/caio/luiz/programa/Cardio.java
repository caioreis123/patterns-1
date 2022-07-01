package caio.luiz.programa;

import caio.luiz.exercicio.GruposMusculares;
import caio.luiz.exercicio.TipoExercicio;

import java.time.DayOfWeek;

public class Cardio extends Status {
    public Cardio(Programa programa) {
        super(programa);
        super.diasDeRepouso.add(DayOfWeek.TUESDAY);
        super.diasDeRepouso.add(DayOfWeek.THURSDAY);
        super.diasDeRepouso.add(DayOfWeek.SATURDAY);
        super.diasDeRepouso.add(DayOfWeek.SUNDAY);
        super.criaSeries(GruposMusculares.MEMBROS_INFERIORES, TipoExercicio.CARDIOVASCULAR);
    }
}
