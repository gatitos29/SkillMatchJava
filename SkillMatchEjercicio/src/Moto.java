public class Moto extends Vehiculos {
    @Override public void arrancar() {
        System.out.println("La moto ha arrancado");
    }
    @Override public void detener() {
        System.out.println("La moto se ha detenido");
    }
    @Override public void combustible() {
        System.out.println("La moto usa gasolina corriente.");
    }

}
