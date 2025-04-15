import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;

    public SistemaSoporte() {
        this.tickets = new ArrayList<>();
    }

    public void crearTicket(TicketSoporte ticket) {
        tickets.add(ticket);
    }

    public List<TicketSoporte> getTickets() {
        return tickets;
    }

    public List<TicketSoporte> listarTicketsPorEstado(String estado) {
        List<TicketSoporte> resultado = new ArrayList<>();
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado().equalsIgnoreCase(estado)) {
                resultado.add(ticket);
            }
        }
        return resultado;
    }
}
