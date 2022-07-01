package caio.luiz;

import caio.luiz.programa.Programa;
import caio.luiz.programa.TipoPrograma;
import caio.luiz.serie.Serie;

public class ProvaDois {
    public static void questao1(){
//        Retornar a próxima série a ser executada
//        A série retornada depende do estado do sistema (state)

//        Os estados são definidos na classe Programa e podem ser:
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
        programa.setTipo(TipoPrograma.CARDIO);
        programa.init();
        while(programa.temProximo()){
            Serie serie = programa.proximo();
            serie.executar();
        }
    }

    public static void questao2(){
//        Observer
    }

    public static void questao3(){
//        nao sei
//        talvez bridge
    }

    public static void questao4(){
//        flyweight
    }

}
