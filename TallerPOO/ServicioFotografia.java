import java.util.Scanner;

public class ServicioFotografia extends Servicio {
    private int cantidadFotos;
    private boolean imprimir;
    private int total;

    @Override
    public void procesar(Scanner sc) {
        System.out.print("Ingrese su nombre: ");
        nombreCliente = sc.nextLine().trim();

        System.out.print("Ingrese su identificación: ");
        identificacion = sc.nextLine().trim();

        System.out.println("\nPrecios:");
        System.out.println("Tomarse la foto: $2.000 por foto");
        System.out.println("Imprimir la foto: $5.000 por foto\n");

        while (true) {
            System.out.print("¿Cuántas fotos desea tomarse? ");
            try {
                cantidadFotos = Integer.parseInt(sc.nextLine().trim());
                if (cantidadFotos > 0) break;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }

        System.out.print("¿Desea imprimir las fotos? (si / no): ");
        imprimir = sc.nextLine().trim().equalsIgnoreCase("si");

        if (imprimir) total = cantidadFotos * 5000;
        else total = cantidadFotos * 2000;
    }

    @Override
    public void generarFactura() {
        System.out.println("\n----- FACTURA DE SERVICIO FOTOGRÁFICO -----");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Cantidad de fotos: " + cantidadFotos);
        System.out.println("Servicio: " + (imprimir ? "Tomar e imprimir" : "Solo tomar"));
        System.out.println("Total a pagar: $" + total);
        System.out.println("-------------------------------------------\n");
    }
}
