package caio.luiz;

import java.util.ArrayList;

public class ExercicioBuilder implements BuilderInterface{
    String nome;
    ArrayList<TipoExercicio> tipoExercicios;
    ArrayList<String> gruposMusculares;
    ArrayList<Equipamento> equipamentos;

    @Override
    public void reset() {
        this.nome = "";
        this.tipoExercicios = new ArrayList<TipoExercicio>();
        this.gruposMusculares = new ArrayList<String>();
        this.equipamentos = new ArrayList<Equipamento>();
    }

    @Override
    public void adicionarNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarTipoExercicios(ArrayList<TipoExercicio> tipoExercicios) {
        this.tipoExercicios = tipoExercicios;
    }

    @Override
    public void adicionarGruposMusculares(ArrayList<String> grupoMusculares) {
        this.gruposMusculares = grupoMusculares;
    }

    @Override
    public void adicionarEquipamentos(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public Exercicio pegaExercicio(){
        return new Exercicio(nome, tipoExercicios, gruposMusculares, equipamentos);
    }
}
