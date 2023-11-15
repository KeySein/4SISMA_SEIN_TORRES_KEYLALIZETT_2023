import java.util.ArrayList;
public class Hotel {
    private final ArrayList<Habitacion> habitaciones;

    public Hotel() {
        habitaciones = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            habitaciones.add(new Habitacionsencilla(i));
        }
        for (int i = 11; i <= 15; i++) {
            habitaciones.add(new HabitacionVIP(i));
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad de habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            String tipo = (habitacion instanceof Habitacionsencilla) ? "Sencilla" : "VIP";
            String estado = (habitacion.estaDisponible()) ? "Disponible" : "Ocupada";
            System.out.println("Habitación " + habitacion.getNumero() + " (" + tipo + "): " + estado);
        }
    }

    public boolean reservarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion && habitacion.estaDisponible()) {
                habitacion.reservar();
                return true; 
            }
        }
        return false; 
    }

    public boolean liberarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion && !habitacion.estaDisponible()) {
                habitacion.liberar();
                return true; 
            }
        }
        return false;
    }
}
    
