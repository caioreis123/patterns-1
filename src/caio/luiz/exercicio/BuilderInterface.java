package caio.luiz.exercicio;

import caio.luiz.equipamento.Equipamento;

public interface BuilderInterface {
    void adicionarTipoDeExercicio(TipoExercicio tipoExercicio);
    void adicionarGrupoMuscular(GruposMusculares grupoMuscular);
    void adicionarEquipamento(Equipamento equipamento);
    Exercicio pegaExercicio(String nomeDoExercicio);
}
