package ejercicios;
  import java.util.Scanner;
public class ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese el tamaño del diamante (debe ser un número impar): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número válido. Por favor, ingrese un número impar.");
                System.out.print("Ingrese el tamaño del diamante (debe ser un número impar): ");
                scanner.next();
            }
            n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println("El tamaño debe ser un número impar.");
            }
        } while (n % 2 == 0);

        int espaciosExternos = n / 2;
        int espaciosInternos = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= espaciosExternos; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 1; j <= espaciosInternos; j++) {
                System.out.print(" ");
            }

            if (i != 1 && i != n) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= n / 2) {
                espaciosExternos--;
                espaciosInternos += 2;
            } else {
                espaciosExternos++;
                espaciosInternos -= 2;
            }
        }

        scanner.close();
    }
}

