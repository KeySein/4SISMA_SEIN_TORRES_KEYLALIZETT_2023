package Arreglos;
import java.util.Scanner;
public class Arreglo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] calificaciones = new double[10];
        
       
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }
        
        
        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }
     
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += calificaciones[i];
        }
        double promedio = suma / 10;
        System.out.println("Promedio de calificaciones: " + promedio);
        
        double calificacionMasAlta = calificaciones[0];
        double calificacionMasBaja = calificaciones[0];
        for (int i = 1; i < 10; i++) {
            if (calificaciones[i] > calificacionMasAlta) {
                calificacionMasAlta = calificaciones[i];
            }
            if (calificaciones[i] < calificacionMasBaja) {
                calificacionMasBaja = calificaciones[i];
            }
        }
        System.out.println("Calificación más alta: " + calificacionMasAlta);
        System.out.println("Calificación más baja: " + calificacionMasBaja);
        
        
        int calificacionesSuperioresAlPromedio = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] > promedio) {
                calificacionesSuperioresAlPromedio++;
            }
        }
        System.out.println("Número de calificaciones superiores al promedio: " + calificacionesSuperioresAlPromedio);
        
        
        int alumnosAprobados = 0;
        int alumnosReprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] >= 5.0) {
                alumnosAprobados++;
            } else {
                alumnosReprobados++;
            }
        }
        System.out.println("Número de alumnos aprobados: " + alumnosAprobados);
        System.out.println("Número de alumnos reprobados: " + alumnosReprobados);
        
        scanner.close();
    }
}

