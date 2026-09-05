public class Candidato extends Usuario{
    private String nombre;
    private String cedula;

    @Override
    public void nombre() {
        System.out.println("Nombre del candidato: " + nombre);
    }

    @Override
    public void identificador() {
        System.out.println("cedula del candidato: " + cedula);
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCedula() {
        return cedula;
    }


    public void setCedula(String nit) {
        this.cedula = nit;
    }
}
