/* 
Vamos a crear un rpograma mediante el cual debamos tener un menu
de seleccion para elegir alguna de las 14 opciones siguientes:
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios 
3.- Convertir Temperaturas
4.- Numeero de positivos y negativos
5.- Tiendita
6.- Area y Perimetro
7.- Tabla
8.- Factorial
9.- Dibujitos
10.- Figura Hueca
11.- Patron 
12.- Diamante
13.- Calculadora
14.- Salir
*/
import java.util.Scanner;
class Estructura {
        public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);

        int opcion, numbinario, total, cantidadproducto, edad, numero, positivos = 0, negativos = 0;
        float precio, resultado, compra = 0, temperatura;
        double descuento = 0, C, F, K, R, base, altura, area, perimetro, radio, volumen;
        String nombreproducto, nombres = "", binario = "", respuesta;
        char letra;

        do {
            System.out.println("     Bienvenido al programa");
            System.out.println("Elije alguna opción deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");// maestro
            System.out.println("3.- Convertir Temperaturas ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tiendita ");// maestro
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");// maestro
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujito ");// maestro
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa tu edad: ");
                    edad = entrada.nextInt();

                    if (edad > 70) {
                        System.out.println("Tu descuento es de 40%.");
                    } else if (edad <= 20) {
                        System.out.println("Tu descuento es de 30%");
                        respuesta = entrada.next();

                        if (edad <=0) {
                            System.out.println("edad no valida");
                        
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese un numero entero positivo que desee convertir a binario: ");
                    numbinario = entrada.nextInt();

                    if (numbinario > 0) {
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0" + binario;
                    } else {
                        binario = " No se puede convertir un numero negativo, solo positivos ";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;

                case 3:
                    System.out.println("Elije el tipo de temperatura papu:");
                    System.out.println("1- Celsius (°C)");
                    System.out.println("2- Fahrenheit (°F)");
                    System.out.println("3- Kelvin (K)");
                    System.out.println("4- Rankine (°R)");
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            F = (temperatura * 9 / 5) + 32;
                            System.out.println("Grados Fahrenheit: " + F + "°F");
                            K = temperatura + 273.15;
                            System.out.println("Grados Kelvin: " + K + "K");
                            R = (temperatura + 273.15) * 9 / 5;
                            System.out.println("Grados Rankine: " + R + "°R");
                            break;

                        case 2:
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            C = (temperatura - 32) * 5 / 9;
                            System.out.println("Grados Celsius: " + C + "°C");
                            K = (temperatura + 459.67) * 5 / 9;
                            System.out.println("Grados Kelvin: " + K + "K");
                            R = temperatura * 9 / 5;
                            System.out.println("Grados Rankine: " + R + "°R");
                            break;

                        case 3:
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            C = temperatura - 273.15;
                            System.out.println("Grados Celsius: " + C + "°C");
                            F = (temperatura * 9 / 5) - 459.67;
                            System.out.println("Grados Fahrenheit: " + F + "°F");
                            R = temperatura * 9 / 5;
                            System.out.println("Grados Rankine: " + R + "°R");
                            break;

                        case 4:
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            C = (temperatura - 491.57) / 1.8;
                            System.out.println("Grados Celsius: " + C + "°C");
                            F = temperatura - 459.67;
                            System.out.println("Grados Fahrenheit: " + F + "°F");
                            K = temperatura / 1.8;
                            System.out.println("Grados Kelvin: " + K + "K");
                            break;

                        default:
                            System.out.println("Ingrese la opcion correcta");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Cuantos numeros vas a ingresar?");
                    total = entrada.nextInt();

                    for (int i = 1; i <= total; i++) {
                        System.out.println("Ingrese el numero: ");
                        numero = entrada.nextInt();

                        if (numero > 0) {
                            positivos++;
                        } else {
                            negativos++;
                        }
                    }

                    System.out.println("Numeros positivos en total: " + positivos);
                    System.out.println("Numeros negativos en total: " + negativos);
                    break;

                case 5:
                    System.out.println("Bienvenido a la tiendita");
                    System.out.println("Por favor ingrese la cantidad de productos a comprar: ");
                    total = entrada.nextInt();

                    for (int i = 1; i <= total; i++) {
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio de este: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado;
                    }

                    System.out.println("TOTAL COMPRADO: " + compra);
                    compra = 0;
                    break;

                case 6:
                    System.out.println("Seleccione una figura:");
                    System.out.println("1- Rectángulo");
                    System.out.println("2- Triángulo");
                    System.out.println("3- Esfera");
                    System.out.println("4- Cilindro");
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese la base del rectángulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del rectángulo: ");
                            altura = entrada.nextDouble();

                            area = base * altura;
                            perimetro = 2 * (base + altura);

                            System.out.println("Área del rectángulo: " + area);
                            System.out.println("Perímetro del rectángulo: " + perimetro);
                            break;

                        case 2:
                            System.out.print("Ingrese la base del triángulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del triángulo: ");
                            altura = entrada.nextDouble();

                            area = (base * altura) / 2;
                            perimetro = base * 3;

                            System.out.println("Área del triángulo: " + area);
                            System.out.println("Perímetro del triángulo: " + perimetro);
                            break;

                        case 3:
                            System.out.print("Ingrese el radio de la esfera: ");
                            radio = entrada.nextDouble();

                            volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
 
                            System.out.println("Volumen de la esfera: " + volumen);
                            break;

                        case 4:
                            System.out.print("Ingrese el radio de la base del cilindro: ");
                            radio = entrada.nextDouble();
                            System.out.print("Ingrese la altura del cilindro: ");
                            altura = entrada.nextDouble();

                            volumen = Math.PI * Math.pow(radio, 2) * altura;

                            System.out.println("Tu volumen del cilindro:  " + volumen);
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                }
                    break;

            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:

                break;
            default:
                System.out.println("Elija una opcion valida");
                break;
        }
        System.out.println("Deseas repetir el programa ingresa s para si");
        letra = entrada.next().charAt(0);

    } while (letra == 'S' || letra == 's');
}
}