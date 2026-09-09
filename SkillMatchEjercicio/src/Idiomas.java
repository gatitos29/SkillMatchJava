import java.util.Scanner;

public class Idiomas extends Evaluaciones {

    private int puntajeObtenido;

    private final int puntajeMinimo = 90;

    public Idiomas(int puntajeObtenido) {

        this.puntajeObtenido = puntajeObtenido;
    }

    @Override
    public void nombre() {
        System.out.println("Evaluacion de Idiomas");
    }

    @Override
    public void tipo() {
        System.out.println("Completar Frases");
    }

    @Override
    public void descripcion() {
        System.out.println("Evaluacion sobre idiomas en la que se completan frases");
    }

    @Override
    public void puntaje() {
        System.out.println("Puntaje minimo 90 / 100");
    }

    @Override
    public void duracion() {
        System.out.println("2 horas");
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }
}