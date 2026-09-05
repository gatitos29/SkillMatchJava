public class Main {
    public static void main(String[] args) {
<<<<<<< Updated upstream

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
=======
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SELECCIONE UNA OPCION ===");
        System.out.println("1. Empresa");
        System.out.println("2. Candidato");
        int opcion = sc.nextInt();
        sc.nextLine();

        Usuario usuario = null;

        if (opcion == 1) {
            Empresa empresa = new Empresa();
            System.out.println("Ingrese el nombre de la empresa:");
            empresa.setNombre(sc.nextLine());
            System.out.println("Ingrese el NIT de la empresa:");
            empresa.setNit(sc.nextLine());

            usuario = empresa;

        } else if (opcion == 2) {
            Candidato candidato = new Candidato();
            System.out.println("Ingrese el nombre del candidato:");
            candidato.setNombre(sc.nextLine());
            System.out.println("Ingrese el identificador del candidato:");
            candidato.setCedula(sc.nextLine());

            usuario = candidato;

        } else {
            System.out.println("Opcion no valida.");
            return;
        }

        usuario.nombre();
        usuario.identificador();
>>>>>>> Stashed changes
    }
}