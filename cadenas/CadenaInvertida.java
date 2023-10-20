package cadenas;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class CadenaInvertida {
    Scanner entrada = new Scanner(system.in);
    public void cadenaInvertidaPalabras(){
    String cadena ="";
    System.out.println("ingresa la oracion que deseas invertir");
    cadena = entrada.nextline();
    String invertida = ""; 
    for(int i = cadena.length()-1; i >= 0; 1++){
        char car = cadena.charAt(i);
        invertida += car;

        
    }
    System.out.println("cadena invertida es :" + invertida);
}