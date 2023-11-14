import java.util.*;
public class Vista {
public void menu(){
    Scanner entrada = new Scanner(System.in);
    AccionPersona control = new AccionPersona();
    System.out.println("Bienvenido al programa de dormiditos de UTC");
    System.out.println("elija una opcion");
    System.out.println("1.- Mostrar a todos los dormidos");
    System.out.println("2.- Registrar un nuevo dormilon");
    System.out.println("3.- Editar un dormidito");
    System.out.println("4.- Despertar al dormidito");
    System.out.println("5.- Salir");
    int opcion = entrada.nextInt();
    switch(opcion){
        case 1:
        System.out.println("mimidos");
        ArrayList<Persona> listaPersonas = control.mostrarPersona();
        for(Persona objeto : listaPersonas){
            System.out.println("El Id es :" + objeto.getId()+ "\n" 
                              +   "El nombre es :" + objeto.getNombre() + "\n" 
                              + "La edad es :" + objeto.getEdad()+ "\n");
        }
        menu();
        break;
        case 2:
        System.out.println("Ingrese el id del dormilon");
       int idpersona = entrada.nextInt();
        System.out.println("Ingrese el  nombre del dormilon");
        String nombrepersona =entrada.nextLine();
        System.out.println("Ingrese la edad del dormilon");
        int edadpersona = Integer.parseInt(entrada.nextLine());
      Persona personaDormidita = new Persona(idpersona, nombrepersona, edadpersona);
       control.agregarPersona(personaDormidita);
       menu();
       break;
       case 3:
       System.out.println("Ingresa el id del dormidito");
       idpersona = Integer.parseInt(entrada.nextLine());
       Persona personabuscar = control.buscarPersona(idpersona);
       System.out.println("la informacion del dormidito es:"+ "\n"
                          + "ID :" + personabuscar.getId() + "\n"
                          + "Nombre :"+ personabuscar.getNombre() + "\n"
                          + "Edad :" + personabuscar.getEdad() + "\n");

                          System.out.println("ingresa el nuevo nombre del dormidito:");
                          String nuevonombre =entrada.nextLine();
                          System.out.println("ingresa la nueva edad del dormidito: ");
                          int nuevaedad = Integer.parseInt(entrada.nextLine());
                          personabuscar.setNombre(nuevonombre);
                          personabuscar.setEdad(nuevaedad);
                          control.actualizarPersona(personabuscar);
                          menu();
                          break;
                          case 4:
                          System.out.println("Ingresa el id del dormidito a despertar");
                          idpersona = Integer.parseInt(entrada.nextLine());
                           Persona personaEliminar = control.buscarPersona(idpersona);
                           control.eliminarPersona(personaEliminar);
                           System.out.println("El dormidito ya desperto");
                           menu();
                           break;
                           default:
                           System.out.println("Opcion no valida");
                           break;

    }
}
}