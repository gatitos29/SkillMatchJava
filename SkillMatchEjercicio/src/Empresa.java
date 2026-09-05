public class Empresa extends Usuario {

    private String nombre;
    private String nit;

    @Override
    public void nombre() {
        System.out.println("Nombre de la empresa: " + nombre);
    }

    @Override
    public void identificador() {
        System.out.println("NIT de la empresa: " + nit);
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNit() {
        return nit;
    }


    public void setNit(String nit) {
        this.nit = nit;
    }
}