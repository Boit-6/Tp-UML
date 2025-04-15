import java.time.LocalDate;

public class TicketSoporte {
    private static int contadorTickets = 0;

    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte(String descripcion) {
        this.id = ++contadorTickets;
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public TicketSoporte(String descripcion, Usuario usuario) {
        this(descripcion);
        this.usuario = usuario;
    }

    public void cerrarTicket() {
        this.estado = "cerrado";
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public static int obtenerCantidadDeTickets() {
        return contadorTickets;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "N/A") +
                ", tecnico=" + (tecnico != null ? tecnico.getNombre() : "N/A") +
                '}';
    }
}
