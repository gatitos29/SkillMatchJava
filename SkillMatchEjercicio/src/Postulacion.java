
import java.util.Scanner;

public class Postulacion {


    public static void evaluacionesDisponibles() {

        Evaluaciones[] evaluaciones = {
                new Comunicacion(0),
                new Creativa(0),
                new Idiomas(0),
                new Logica(0),
                new Tecnica(0)
        };

        System.out.println("CATÁLOGO DE EVALUACIONES DISPONIBLES");

        for (int i = 0; i < evaluaciones.length; i++) {
            System.out.println("---------------------------");
            System.out.println("OPCION " + (i + 1));
            evaluaciones[i].nombre();
            evaluaciones[i].tipo();
            evaluaciones[i].descripcion();
            evaluaciones[i].puntaje();
            evaluaciones[i].duracion();
        }
    }

    public static boolean verificarAprobacion(int puntajeObtenido, int puntajeMinimo) {
        return puntajeObtenido >= puntajeMinimo;
    }

    public static String calcularPuntaje(int puntajeObtenido, int puntajeMinimo) {

        if (verificarAprobacion(puntajeObtenido, puntajeMinimo)) {
            return "ESTADO: ¡APROBADO! - El candidato continúa en el proceso de selección.";
        } else {
            return "ESTADO: NO APROBADO - No alcanzó el puntaje mínimo requerido "
                    + "(" + puntajeMinimo + " pts). Proceso finalizado.";
        }
    }


    public static void realizarPostulacion(Scanner sc) {

        evaluacionesDisponibles();

        System.out.println("..................................................");
        System.out.println("Seleccione la evaluación a realizar:");

        Comunicacion comunicacion = new Comunicacion(0);
        Creativa creativa = new Creativa(0);
        Idiomas idiomas = new Idiomas(0);
        Logica logica = new Logica(0);
        Tecnica tecnica = new Tecnica(0);

        int opcion = sc.nextInt();

        while (opcion < 1 || opcion > 5) {
            System.out.println(">>> Opción no válida.");
            System.out.print("Intente nuevamente: ");
            opcion = sc.nextInt();
        }

        System.out.print("Ingrese el puntaje obtenido (0 - 100): ");
        int puntaje = sc.nextInt();

        int puntajeMinimo;
        int puntajeObtenido;

        if (opcion == 1) {

            comunicacion.setPuntajeObtenido(puntaje);
            puntajeObtenido = comunicacion.getPuntajeObtenido();
            puntajeMinimo = comunicacion.getPuntajeMinimo();

        } else if (opcion == 2) {

            creativa.setPuntajeObtenido(puntaje);
            puntajeObtenido = creativa.getPuntajeObtenido();
            puntajeMinimo = creativa.getPuntajeMinimo();

        } else if (opcion == 3) {

            idiomas.setPuntajeObtenido(puntaje);
            puntajeObtenido = idiomas.getPuntajeObtenido();
            puntajeMinimo = idiomas.getPuntajeMinimo();

        } else if (opcion == 4) {

            logica.setPuntajeObtenido(puntaje);
            puntajeObtenido = logica.getPuntajeObtenido();
            puntajeMinimo = logica.getPuntajeMinimo();

        } else {

            tecnica.setPuntajeObtenido(puntaje);
            puntajeObtenido = tecnica.getPuntajeObtenido();
            puntajeMinimo = tecnica.getPuntajeMinimo();
        }

        System.out.println(calcularPuntaje(puntajeObtenido, puntajeMinimo));

    }
}

