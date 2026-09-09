public class Comunicacion extends Evaluaciones {

    private int puntajeObtenido;

    private final int puntajeMinimo = 60;

    public Comunicacion(int puntajeObtenido) {

        this.puntajeObtenido = puntajeObtenido;
    }
    @Override
    public void nombre() {
        System.out.println("Evaluacion de Comunicacion");
    }

    @Override
    public void tipo() {
        System.out.println("Multiple");
    }

    @Override
    public void descripcion() {
        System.out.println("Evaluacion sobre saludos en diferentes idiomas");
    }

    @Override
    public void puntaje() {
        System.out.println("Puntaje minimo 60 / 100");
    }

    @Override
    public void duracion() {
        System.out.println("1 hora");
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