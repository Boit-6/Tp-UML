public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Juan Pérez", "juan.perez@email.com");

        Tecnico tecnico = new Tecnico(1, "Laura Gómez", "Redes");

        SistemaSoporte sistemaSoporte = new SistemaSoporte();

        TicketSoporte ticket1 = new TicketSoporte("Problema con el servidor", usuario);
        TicketSoporte ticket2 = new TicketSoporte("Fallo en la conexión a internet");

        sistemaSoporte.crearTicket(ticket1);
        sistemaSoporte.crearTicket(ticket2);

        ticket1.asignarTecnico(tecnico);

        System.out.println("Todos los tickets:");
        for (TicketSoporte ticket : sistemaSoporte.getTickets()) {
            System.out.println(ticket);
        }

        ticket1.cerrarTicket();

        System.out.println("\nTickets abiertos:");
        for (TicketSoporte ticket : sistemaSoporte.listarTicketsPorEstado("abierto")) {
            System.out.println(ticket);
        }

        System.out.println("\nTickets cerrados:");
        for (TicketSoporte ticket : sistemaSoporte.listarTicketsPorEstado("cerrado")) {
            System.out.println(ticket);
        }

        System.out.println("\nCantidad total de tickets creados: " + TicketSoporte.obtenerCantidadDeTickets());
    }
}
