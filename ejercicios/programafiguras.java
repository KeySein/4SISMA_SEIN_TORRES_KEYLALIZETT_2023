package ejercicios;
  import java.util.Scanner;
public class ejercicio01 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Salir");
            System.out.print("Ingrese su elección: ");
            
            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();
                
                if (opcion == 1) {
                    calcularAreaCirculo(scanner);
                } else if (opcion == 2) {
                    calcularAreaCuadrado(scanner);
                } else if (opcion == 3) {
                    System.out.println("Saliendo del programa.");
                    break;
                } else {
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        if (scanner.hasNextDouble()) {
            double radio = scanner.nextDouble();
            double area = Math.PI * radio * radio;
            System.out.println("El área del círculo es: " + area);
        } else {
            System.out.println("Entrada no válida. Por favor, ingrese un número.");
            scanner.next();
        }
    }
 }   

