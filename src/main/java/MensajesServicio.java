import java.util.Scanner;

public class MensajesServicio {

    public static void listarMensajes() {

    }

    public static void crearMensajes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mensaje: ");
        String mensaje = scanner.nextLine();
        System.out.print("Nombre del autor: ");
        String autor = scanner.nextLine();

        Mensajes nuevoMensaje = new Mensajes();
        nuevoMensaje.setMensaje(mensaje);
        nuevoMensaje.setAutor(autor);
        MensajesDAO.escribirMensajeDB(nuevoMensaje);
    }

    public static void borrarMensajes() {

    }

    public static void editarMensajes() {

    }
}
