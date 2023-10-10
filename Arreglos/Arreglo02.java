package Arreglos;
import java.util.Scanner;
public class Arreglo02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Creamos un array para almacenar los números
        

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = scanner.nextInt();
        }
        
        scanner.close(); 
        
        int suma = 0;
        int contador = 0;
        
        
        for (int i = 0; i < 10; i += 2) {
            suma += numeros[i];
            contador++;
        }
        
        double promedio = (double) suma / contador;
        
        System.out.println("El promedio de los números en posiciones pares es: " + promedio);
    }
}

