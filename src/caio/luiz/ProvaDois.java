package caio.luiz;

import caio.luiz.exercicioCombinado.ExercicioCombinado;
import caio.luiz.observador.Interessado;
import caio.luiz.programa.Programa;
import caio.luiz.programa.TipoPrograma;
import caio.luiz.serie.Serie;

public class ProvaDois {
    public static void questao1(){
//        Retornar a próxima série a ser executada
//        A série retornada depende do status do programa (strategy)

//        Os status são definidos na classe Programa e podem ser:
//        - Full Workout:
//          1. não retorna nenhuma série se for dia de repouso (terça, quinta, sábado e domingo)
//          2. retorna a próxima série de exercícios considerando o conjunto completo de séries
//        - ABCD:
//          1. não retorna nenhuma série se for dia de repouso (sexta, sabado e domingo)
//          2. se for segunda retorna exercícios da série de ombro e abdominal (A)
//          3. Se for terça retorna exercícios da série de membros inferiores (B)
//          4. Se for quarta retorna exercícios da série de peitoral e triceps (C)
//          5. Se for quinta retorna exercícios da série de biceps e costas (D)
//        - Cardio:
//          1. não retorna nenhuma série se for dia de repouso (terça, quinta, sabado e domingo)
//          2. retorna o próximo exercício da série de cardio

        Programa programa = new Programa();
        programa.setTipo(TipoPrograma.FULL_WORKOUT);
        programa.init();
        while(programa.temProximo()){
            Serie serie = programa.proximo();
            serie.executar();
        }
    }

    public static void questao2(){
//        observer

        Interessado interessado1 = new Interessado();
        Interessado interessado2 = new Interessado();

        Programa programa = new Programa();
        programa.setTipo(TipoPrograma.CARDIO);
        programa.init();

        programa.addInteressado(interessado1);
        programa.addInteressado(interessado2);

        while(programa.temProximo()){
            Serie serie = programa.proximo();
            serie.executar();
        }
    }

    public static void questao3(){
//        decorator
        ExercicioCombinado exercicioCombinado = new ExercicioCombinado();
    }

    public static void questao4(){
//        flyweight
        Programa programa = new Programa();
        programa.setTipo(TipoPrograma.CARDIO);
        programa.init();
        while(programa.temProximo()){
            Serie serie = programa.proximo();
            serie.executar();
        };
        System.out.println("Quantidade de videos deve ser 2: " + Serie.videoPorSerie.size());
    }

}
