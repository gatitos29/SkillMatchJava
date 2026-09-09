public class Comunicacion extends Evaluaciones {

    private String nombre;
    private String tipo;
    private String descripcion;
    private String puntaje;
    private String duracion;


    public Comunicacion(String nombre, String tipo, String descripcion,
                        String puntaje, String duracion) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.duracion = duracion;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuentaje() {
        return puntaje;
    }

    public void setPuentaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}