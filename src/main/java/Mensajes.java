public class Mensajes {
    private int id;
    private String mensaje;
    private String autor;
    private String fecha;


    //Constructor
    public Mensajes() {
    }

    public Mensajes(String mensaje, String autor, String fecha) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha = fecha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
