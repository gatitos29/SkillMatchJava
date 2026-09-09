public class Creativa extends Evaluaciones {

    private int puntajeObtenido;

    private final int puntajeMinimo = 70;

    public Creativa(int puntajeObtenido) {

        this.puntajeObtenido = puntajeObtenido;
    }

    @Override
    public void nombre() {
        System.out.println("Evaluacion Creativa");
    }

    @Override
    public void tipo() {
        System.out.println("Diseño");
    }

    @Override
    public void descripcion() {
        System.out.println("Trazos perfecto de diseño de arquitectura.");
    }

    @Override
    public void puntaje() {
        System.out.println("Puntaje minimo 70 / 100");
    }

    @Override
    public void duracion() {
        System.out.println("3 horas");
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
