public class Logica extends Evaluaciones {

    private int puntajeObtenido;

    private final int puntajeMinimo = 80;

    public Logica(int puntajeObtenido) {

        this.puntajeObtenido = puntajeObtenido;
    }

    @Override
    public void nombre() {
        System.out.println("Evaluacion de Logica");
    }

    @Override
    public void tipo() {
        System.out.println("verdadero o falso");
    }

    @Override
    public void descripcion() {
        System.out.println("Evaluacion sobre preguntas logicas");
    }

    @Override
    public void puntaje() {
        System.out.println("Puntaje minimo 80 / 100");
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