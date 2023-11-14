/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11ventanita;

/**
 *
 * @author keyla
 */
import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Hola mundo");
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
