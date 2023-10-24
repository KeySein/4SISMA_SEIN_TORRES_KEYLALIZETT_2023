
import javax.swing.JOptionPane;
public class Datos {
    Estudiante obj[] = new Estudiante[10];

    int x = 0;
    void menu(){
        String var = "si";
        String mensaje = "";

        while(var.equalsIgnoreCase("si")){
            int op = Integer.parseInt(JOptionPane.showInputDialog(
                "ingresa la opcion deseada: \n " 
                + "1.Dar de alta un nuevo estudiante \n"
                +  "2.-Mostrar los datos de los estudiantes \n"));

                switch(op){
                    case 1:
                       pedirEstudiante();
                    break;
                    case 2:
                    mostrarEstudiante();
                    break;
                    default:
                    JOptionPane.showMessageDialog(mensaje "opcion no valida");

                }
                mensaje = JOptionPane.showInputDialog("desea repetir");

        } 
    }
    public void pedirEstudiante(){
        int numbol = Interger.parseInt(
            JOptionPane.showInputDialog( 
                "ingresa el numero de boleta"));
                String nom = JOptionPane.showInputDialog

    }
}
