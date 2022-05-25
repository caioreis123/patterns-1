package caio.luiz;

import java.util.ArrayList;

public interface BuilderInterface {
    void reset();
    void adicionarTipoExercicios(ArrayList<TipoExercicio> tipoExercicios);
    void adicionarGruposMusculares(ArrayList<String> grupoMusculares);
    void adicionarEquipamentos(ArrayList<Equipamento> equipamentos);
}
