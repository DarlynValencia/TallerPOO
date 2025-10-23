import java.util.Scanner;

public abstract class Servicio {
    protected String nombreCliente;
    protected String identificacion;

    public abstract void procesar(Scanner sc);
    public abstract void generarFactura();
}
