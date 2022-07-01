package caio.luiz.exercicio;

import caio.luiz.equipamento.Equipamento;

import java.util.ArrayList;

public class ExercicioBuilder implements BuilderInterface{
    String nome;
    ArrayList<TipoExercicio> tipoExercicios;
    ArrayList<GruposMusculares> gruposMusculares;
    ArrayList<Equipamento> equipamentos;

    public ExercicioBuilder(){
        this.tipoExercicios = new ArrayList<TipoExercicio>();
        this.gruposMusculares = new ArrayList<GruposMusculares>();
        this.equipamentos = new ArrayList<Equipamento>();
    }

    @Override
    public void adicionarTipoDeExercicio(TipoExercicio tipoExercicio) {
        this.tipoExercicios.add(tipoExercicio);
    }

    @Override
    public void adicionarGrupoMuscular(GruposMusculares grupoMuscular) {
        this.gruposMusculares.add(grupoMuscular);
    }

    @Override
    public void adicionarEquipamento(Equipamento equipamento) {
        this.equipamentos.add(equipamento);
    }

    @Override
    public Exercicio pegaExercicio(String nomeDoExercicio){
            return new Exercicio(nomeDoExercicio, tipoExercicios, gruposMusculares, equipamentos);
    }
}
