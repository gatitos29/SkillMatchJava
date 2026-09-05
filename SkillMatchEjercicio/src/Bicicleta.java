public class Bicicleta extends Vehiculos {
    @Override public void arrancar() {
        System.out.println("La bicicleta ha arrancado");
    }
    @Override public void detener() {
        System.out.println("La bicicleta se ha detenido");
    }
    @Override public void combustible() {
        System.out.println("La bicicleta no usa gasolina");
    }

}
