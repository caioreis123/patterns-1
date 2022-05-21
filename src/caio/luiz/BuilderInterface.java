package caio.luiz;

import java.util.ArrayList;

public interface BuilderInterface {
    public void reset();
    public void adicionarNome(String nome);
    public void adicionarTipoExercicios(ArrayList<TipoExercicio> tipoExercicios);
    public void adicionarGruposMusculares(ArrayList<String> grupoMusculares);
    public void adicionarEquipamentos(ArrayList<Equipamento> equipamentos);
}
