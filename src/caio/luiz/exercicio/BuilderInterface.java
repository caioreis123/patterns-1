package caio.luiz.exercicio;

import caio.luiz.equipamento.Equipamento;

public interface BuilderInterface {
    BuilderInterface adicionarTipoDeExercicio(TipoExercicio tipoExercicio);
    BuilderInterface adicionarGrupoMuscular(GruposMusculares grupoMuscular);
    BuilderInterface adicionarEquipamento(Equipamento equipamento);

    ExercicioBuilder combinarExercicio(Exercicio exercicio);

    ExercicioBuilder reset();

    Exercicio pegaExercicio(String nomeDoExercicio);
}
