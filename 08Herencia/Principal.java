import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int opcion;
    char letra;
    do{
        System.out.println("     Bienvenido a la tiendita de adopcion de mascotas");
        System.out.println("Elije el animalito que deseas adoptar ");
        System.out.println("1.- Michi ");
        System.out.println("2.- Perro ");
        System.out.println("3.- Conejo ");
        System.out.println("4.- Huron");
        System.out.println("5.- Hamster ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                  Michi gato = new Michi("Bolita",
                               " De la calle",
                                "croquetas bb",
                                 1,
                                  7);
       gato.mostrarMichi(); 
        
                break;
                case 2:
                  Perro perro = new Perro("wilma", "Bulldog", "croqueta adulto", 2, "cafe claro");
                  perro.mostrarPerro();
                 break;
                 case 3:
                 Conejo conejo = new Conejo("fredy", "desconocida", "lechuga",1, "pequeño");
                 conejo.mostrarConejo();
                 break;
                 case 4:
                 Huron huron = new Huron("Hana", "whippet", "carne", 3, 20);
                 huron.mostrarHuron();
                 break;
                 case 5:
                 Hamster hamster = new Hamster("amber","roboroski", "semillas", 1, "hembra");
                 hamster.mostrarHamster();
                 break;

            default:
            System.out.println("Lo siento el animal que ingresaste no esta dentro de las adopciones");
                break;
        }
              System.out.println("Deseas repetir el programa ingresa s para si");
               letra = entrada.next().charAt(0);
            } while (letra == 'S' || letra == 's');
    }
}
