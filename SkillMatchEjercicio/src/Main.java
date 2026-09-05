public class Main {
    public static void main(String[] args) {

        Vehiculos[] vehiculos = {
                new Carro(),
                new Moto(),
                new Bicicleta()
        };

        for (Vehiculos vehiculo1 : vehiculos) {
            vehiculo1.arrancar();
            vehiculo1.detener();
            vehiculo1.combustible();
        }
    }
}