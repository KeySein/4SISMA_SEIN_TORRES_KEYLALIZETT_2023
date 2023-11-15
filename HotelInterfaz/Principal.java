public class Principal {
    public static void main(String[] args) {
        Hotel hot = new Hotel();

        hot.mostrarDisponibilidad();

     
        int numeroReserva = 5;
        boolean reservaExitosa = hot.reservarHabitacion(numeroReserva);
        if (reservaExitosa) {
            System.out.println("¡Reserva de habitación " + numeroReserva + " exitosa!");
        } else {
            System.out.println("No se pudo reservar la habitación " + numeroReserva);
        }

        hot.mostrarDisponibilidad();

        int numeroLiberacion = 5;
        boolean liberacionExitosa = hot.liberarHabitacion(numeroLiberacion);
        if (liberacionExitosa) {
            System.out.println("¡Liberación de habitación " + numeroLiberacion + " exitosa!");
        } else {
            System.out.println("No se pudo liberar la habitación " + numeroLiberacion);
        }

        hot.mostrarDisponibilidad();
    }
}
