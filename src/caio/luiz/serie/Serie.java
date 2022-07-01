package caio.luiz.serie;

import caio.luiz.exercicio.Exercicio;

public class Serie {
    public int numRepeticoes;
    public int qtde;
    public Exercicio exercicio;

    public Serie(int numRepeticoes, int qtde, Exercicio exercicio) {
        this.numRepeticoes = numRepeticoes;
        this.qtde = qtde;
        this.exercicio = exercicio;
    }

    public void executar() {
        System.out.println("Executando " + numRepeticoes + " series de " + qtde + " de "  + exercicio);
    }
}
