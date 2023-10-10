package Arreglos;
import java.util.Scanner;
public class Arreglo01 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int totalPositivos = 0;
        int totalNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > 0) {
                totalPositivos += numeros[i];
                cantidadPositivos++;
            } else if (numeros[i] < 0) {
                totalNegativos += numeros[i];
                cantidadNegativos++;
            }
        }

        sc.close();

        if (cantidadPositivos > 0) {
            double promedioPositivos = (double) totalPositivos / cantidadPositivos;
            System.out.println("Promedio de números positivos: " + promedioPositivos);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        if (cantidadNegativos > 0) {
            double promedioNegativos = (double) totalNegativos / cantidadNegativos;
            System.out.println("Promedio de números negativos: " + promedioNegativos);
        } else {
            System.out.println("No se ingresaron números negativos.");
        }
    }
}