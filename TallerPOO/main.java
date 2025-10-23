import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Bienvenido a la Tienda. ¿Qué desea hacer? (comprar / fotos / salir): ");
            String opcion = sc.nextLine().trim().toLowerCase();

            Servicio servicio = null;

            switch (opcion) {
                case "comprar" -> servicio = new ServicioCompra();
                case "fotos" -> servicio = new ServicioFotografia();
                case "salir" -> {
                    System.out.println("Gracias por visitar la tienda. ¡Vuelva pronto!");
                    sc.close();
                    return;
                }
                default -> {
                    System.out.println("Opción no válida. Intente de nuevo.\n");
                    continue;
                }
            }

            servicio.procesar(sc);
            servicio.generarFactura();
        }
    }
}
