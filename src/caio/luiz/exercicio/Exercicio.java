package caio.luiz.exercicio;

import caio.luiz.equipamento.Equipamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercicio {
    String nome;
    Set<TipoExercicio> tipoExercicios;
    Set<GruposMusculares> gruposMusculares;
    Set<Equipamento> equipamentos;

    protected Exercicio(String nome, Set<TipoExercicio> tipoExercicios, Set<GruposMusculares> gruposMusculares, Set<Equipamento> equipamentos) {
        this.nome = nome;
        this.tipoExercicios = tipoExercicios;
        this.gruposMusculares = gruposMusculares;
        this.equipamentos = equipamentos;
    }
    public String toString() {
        return "Exercicio{" + "nome=" + nome + ", tipoExercicios=" + tipoExercicios + ", gruposMusculares=" + gruposMusculares + ", equipamentos=" + equipamentos + '}';
    }

    @Override
    public boolean equals(Object obj){
        Class<?> classeDoAtual = getClass();
        Class<?> classeDoComparado = obj.getClass();
        if (classeDoAtual != classeDoComparado)
            return false;
        Exercicio outroExercicio = (Exercicio) obj;
        List<String> identificadoresDeEquipamentosDoOutro = outroExercicio.equipamentos.stream().map(Equipamento::getIdentificador).toList();
        List<String> identificadoresDeEquipamentosDoAtual = this.equipamentos.stream().map(Equipamento::getIdentificador).toList();
        return
                (outroExercicio.tipoExercicios.equals(this.tipoExercicios))
                &&
                (outroExercicio.gruposMusculares.equals(this.gruposMusculares))
                &&
                (identificadoresDeEquipamentosDoOutro.equals(identificadoresDeEquipamentosDoAtual));
    }

    public String getNome() {
        return nome;
    }
}
