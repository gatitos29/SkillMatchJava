public class Tecnica extends Evaluaciones {

    private int puntajeObtenido;

    private final int puntajeMinimo = 85;

    public Tecnica(int puntajeObtenido) {

        this.puntajeObtenido = puntajeObtenido;
    }

    @Override
    public void nombre() {
        System.out.println("Evaluacion Tecnica");
    }

    @Override
    public void tipo() {
        System.out.println("Ejercicio practico");
    }

    @Override
    public void descripcion() {
        System.out.println("Evaluacion de habilidades mediante un ejercicio practico");
    }

    @Override
    public void puntaje() {
        System.out.println("Puntaje minimo 85 / 100");
    }

    @Override
    public void duracion() {
        System.out.println("45 minutos");
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