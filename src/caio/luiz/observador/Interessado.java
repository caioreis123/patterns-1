package caio.luiz.observador;

public class Interessado implements Obervador{
    @Override
    public void notifica(EstadoDeFim estado) {
        System.out.println("Não há mais series para hoje");
        System.out.println("Fim do programa: " + estado.horaDoFim + " - " + estado.tipoPrograma);
    }
}
