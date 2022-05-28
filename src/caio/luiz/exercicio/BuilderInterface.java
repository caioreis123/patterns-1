package caio.luiz.exercicio;

import caio.luiz.equipamento.Equipamento;

import java.util.ArrayList;

public interface BuilderInterface {
    void novoExercicio(String nomeDoExercicio);
    void adicionarTiposDeExercicio(ArrayList<TipoExercicio> tipoExercicios);
    void adicionarGruposMusculares(ArrayList<String> grupoMusculares);
    void adicionarEquipamentos(ArrayList<Equipamento> equipamentos);
}
