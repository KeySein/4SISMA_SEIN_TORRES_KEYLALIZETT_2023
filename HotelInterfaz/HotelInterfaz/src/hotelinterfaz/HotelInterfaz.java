/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelinterfaz;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author keyla
 */
public class HotelInterfaz {

    public static void main(String[] args) {
  Hotel hotel = new Hotel();
        hotel.mostrarDisponibilidad();

     
        int numeroReserva = 5;
        boolean reservaExitosa = hotel.reservarHabitacion(numeroReserva);
        if (reservaExitosa) {
            System.out.println("¡Reserva de habitación " + numeroReserva + " exitosa!");
        } else {
            System.out.println("No se pudo reservar la habitación " + numeroReserva);
        }

        hotel.mostrarDisponibilidad();

        int numeroLiberacion = 5;
        boolean liberacionExitosa = hotel.liberarHabitacion(numeroLiberacion);
        if (liberacionExitosa) {
            System.out.println("¡Liberación de habitación " + numeroLiberacion + " exitosa!");
        } else {
            System.out.println("No se pudo liberar la habitación " + numeroLiberacion);
        }

        hotel.mostrarDisponibilidad();
    }




    /**
     * @param args the command line arguments
     */
    public static void HotelInterfaz(String[] args) {
        JFrame ventana = new JFrame("Bienvenido");
        ventana.setSize(370, 170);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        agregarComponentes(panel);
        ventana.setVisible(true);
        
        
        
        
    }

    private static void agregarComponentes(JPanel panel) {
        panel.setLayout(null);
         JLabel userlabel = new JLabel("Nombre de usuario");
        userlabel.setBounds(10, 10, 120, 50);
        panel.add(userlabel);
        JTextField usertxt = new JTextField(20);
        usertxt.setBounds(160, 20, 160, 25);
        panel.add(usertxt);
        
        JLabel userpass = new JLabel("Password");
        userpass.setBounds(10, 40, 80, 50);
        panel.add(userpass);
        JTextField passtxt = new JTextField(20);
        passtxt.setBounds(160, 50, 160, 25);
        panel.add(passtxt);
        JButton loginbutton = new JButton("Iniciar sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        JButton registrobutton = new JButton("Registrate");
        registrobutton.setBounds(180, 80, 120, 25);
        panel.add(registrobutton);
        
    }
    
}

    

