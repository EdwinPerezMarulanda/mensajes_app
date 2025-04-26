import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try(Connection con = conexion.getConnection()) {
            System.out.println("Conectado a la base de datos");
        }catch(Exception e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }
}

