import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----- Mensajes -----");
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            //Menú
            System.out.println("********************");
            System.out.println(" 1. Listar mensajes");
            System.out.println(" 2. Crear mensajes");
            System.out.println(" 3. Borrar mensajes");
            System.out.println(" 4. Editar mensajes");
            System.out.println(" 5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            //Opciones
            switch (opcion) {
                case 1:
                    MensajesServicio.listarMensajes();
                    break;
                case 2:
                    MensajesServicio.crearMensajes();
                    break;
                case 3:
                    MensajesServicio.borrarMensajes();
                    break;
                case 4:
                    MensajesServicio.editarMensajes();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}

