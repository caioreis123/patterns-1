package caio.luiz.exercicio;

import caio.luiz.equipamento.Equipamento;

import java.util.HashSet;
import java.util.Set;

public class ExercicioBuilder implements BuilderInterface{
    String nome;
    Set<TipoExercicio> tipoExercicios;
    Set<GruposMusculares> gruposMusculares;
    Set<Equipamento> equipamentos;

    public ExercicioBuilder(){
        this.tipoExercicios = new HashSet<>();
        this.gruposMusculares = new HashSet<>();
        this.equipamentos = new HashSet<>();
    }

    @Override
    public ExercicioBuilder adicionarTipoDeExercicio(TipoExercicio tipoExercicio) {
        this.tipoExercicios.add(tipoExercicio);
        return this;
    }

    @Override
    public ExercicioBuilder adicionarGrupoMuscular(GruposMusculares grupoMuscular) {
        this.gruposMusculares.add(grupoMuscular);
        return this;
    }

    @Override
    public ExercicioBuilder adicionarEquipamento(Equipamento equipamento) {
        this.equipamentos.add(equipamento);
        return this;
    }

    @Override
    public ExercicioBuilder combinarExercicio(Exercicio exercicio){
        this.tipoExercicios.addAll(exercicio.tipoExercicios);
        this.gruposMusculares.addAll(exercicio.gruposMusculares);
        this.equipamentos.addAll(exercicio.equipamentos);
        return this;
    }

    @Override
    public ExercicioBuilder reset() {
        this.tipoExercicios = new HashSet<>();
        this.gruposMusculares = new HashSet<>();
        this.equipamentos = new HashSet<>();
        return this;
    }

    @Override
    public Exercicio pegaExercicio(String nomeDoExercicio){
            return new Exercicio(nomeDoExercicio, tipoExercicios, gruposMusculares, equipamentos);
    }

}
