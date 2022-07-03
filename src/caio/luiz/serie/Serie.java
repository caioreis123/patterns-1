package caio.luiz.serie;

import caio.luiz.exercicio.Exercicio;

import java.util.HashMap;

public class Serie {
    public int numRepeticoes;
    public int qtde;
    public Exercicio exercicio;
    public static HashMap<String, String> videoPorSerie = new HashMap<String, String>();
    public String descricaoDoExercicio = "";
    public String video = "";

    public Serie(int numRepeticoes, int qtde, Exercicio exercicio) {
        this.numRepeticoes = numRepeticoes;
        this.qtde = qtde;
        this.exercicio = exercicio;
        this.descricaoDoExercicio = "Executando " + numRepeticoes + " series de " + qtde + " de " + exercicio;
        this.video = getVideo(descricaoDoExercicio);
    }

    /**
     * Flyweight logic
     * @param descricaoDoExercicio
     * @return
     */
    private String getVideo(String descricaoDoExercicio) {
        if(!videoPorSerie.containsKey(descricaoDoExercicio)) {
            String videoDoExercicio = "[VIDEO DO EXERCICIO]" + descricaoDoExercicio;
            videoPorSerie.put(descricaoDoExercicio, videoDoExercicio);
        }
        return videoPorSerie.get(descricaoDoExercicio);
    }

    public void executar() {
        System.out.println(descricaoDoExercicio);
        System.out.println(video);
    }

    @Override
    public boolean equals(Object obj){
        if (getClass() != obj.getClass())
            return false;
        Serie outraSerie = (Serie) obj;
       return
            (outraSerie.numRepeticoes == this.numRepeticoes)
            &&
            (outraSerie.qtde == this.qtde)
            &&
            (outraSerie.exercicio.equals(this.exercicio));
    }
}
