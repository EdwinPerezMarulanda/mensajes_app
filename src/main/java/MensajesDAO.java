import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {

    public static void leerMensajeDB() {

    }
    public static void escribirMensajeDB(Mensajes mensaje) {
        Conexion conexion = new Conexion();
        try( Connection conn = conexion.getConnection()) {
            PreparedStatement ps = null;
            try{
                String sql = "INSERT INTO mensajes (mensaje, autor) VALUES (?,?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor());
                ps.executeUpdate();
                System.out.println("Mensaje almacenado en la base de datos");
            } catch (SQLException e) {
                System.out.println("Error al almacenar el mensaje en la base de datos " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        }
    }
    public static void eliminarMensajeDB(int mensaje) {

    }
    public static void actualizarMensajeDB(Mensajes mensaje) {

    }
}
