import java.util.Scanner;

public class ServicioCompra extends Servicio {
    private String tipoProducto;
    private String modelo;
    private int precio;
    private int edad;

    @Override
    public void procesar(Scanner sc) {
        System.out.print("Ingrese su nombre: ");
        nombreCliente = sc.nextLine().trim();

        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(sc.nextLine().trim());

        if (edad < 18) {
            System.out.println("No se puede realizar la venta a menores de edad. Regresando al menú...\n");
            return;
        }

        System.out.print("Ingrese su identificación: ");
        identificacion = sc.nextLine().trim();

        while (true) {
            System.out.print("¿Qué desea comprar? (camaras / impresoras): ");
            tipoProducto = sc.nextLine().trim().toLowerCase();
            if (tipoProducto.equals("camaras") || tipoProducto.equals("impresoras")) break;
            System.out.println("Opción inválida, intente de nuevo.");
        }

        if (tipoProducto.equals("camaras")) {
            System.out.println("Modelos disponibles:");
            System.out.println("1. Canon - $1.500.000");
            System.out.println("2. Sony  - $1.200.000");
            System.out.println("3. Nikon - $1.000.000");
            System.out.print("Elija modelo (1-3): ");
            int opcion = Integer.parseInt(sc.nextLine().trim());
            switch (opcion) {
                case 1 -> { modelo = "Canon"; precio = 1500000; }
                case 2 -> { modelo = "Sony"; precio = 1200000; }
                case 3 -> { modelo = "Nikon"; precio = 1000000; }
                default -> { modelo = "Desconocido"; precio = 0; }
            }
        } else {
            System.out.println("Modelos disponibles:");
            System.out.println("1. Epson - $800.000");
            System.out.println("2. HP    - $750.000");
            System.out.println("3. Canon - $700.000");
            System.out.print("Elija modelo (1-3): ");
            int opcion = Integer.parseInt(sc.nextLine().trim());
            switch (opcion) {
                case 1 -> { modelo = "Epson"; precio = 800000; }
                case 2 -> { modelo = "HP"; precio = 750000; }
                case 3 -> { modelo = "Canon"; precio = 700000; }
                default -> { modelo = "Desconocido"; precio = 0; }
            }
        }
    }

    @Override
    public void generarFactura() {
        if (edad < 18) return;

        System.out.println("\n----- FACTURA DE COMPRA -----");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Edad: " + edad);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Producto: " + tipoProducto);
        System.out.println("Modelo: " + modelo);
        System.out.println("Total a pagar: $" + precio);
        System.out.println("-----------------------------\n");
    }
}
