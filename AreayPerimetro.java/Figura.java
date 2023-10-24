
public class Figura  extends FiguraGeometrica{
class Rectangulo extends FiguraGeometrica {
    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public double calcularArea() {
        return 0.5 * base * altura;
    }


    public double calcularPerimetro() {
        return -1;
    }
}

class Rombo extends FiguraGeometrica {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Elige una figura geométrica: ");
            System.out.println("1. Rectángulo");
            System.out.println("2. Círculo");
            System.out.println("3. Triángulo");
            System.out.println("4. Rombo");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese la longitud del lado A del rectángulo: ");
                double ladoA = scanner.nextDouble();
                System.out.print("Ingrese la longitud del lado B del rectángulo: ");
                double ladoB = scanner.nextDouble();

                Rectangulo rectangulo = new Rectangulo(ladoA, ladoB);
                System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
            } else if (opcion == 2) {
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();

                Circulo circulo = new Circulo(radio);
                System.out.println("Área del círculo: " + circulo.calcularArea());
                System.out.println("Longitud de la circunferencia: " + circulo.calcularPerimetro());
            } else if (opcion == 3) {
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();

                Triangulo triangulo = new Triangulo(base, altura);
                System.out.println("Área del triángulo: " + triangulo.calcularArea());
                System.out.println("Los triángulos no tienen un perímetro fijo.");
            } else if (opcion == 4) {
                System.out.print("Ingrese la longitud de la diagonal mayor del rombo: ");
                double diagonalMayor = scanner.nextDouble();
                System.out.print("Ingrese la longitud de la diagonal menor del rombo: ");
                double diagonalMenor = scanner.nextDouble();
                System.out.print("Ingrese la longitud de un lado del rombo: ");
                double lado = scanner.nextDouble();

                Rombo rombo = new Rombo(diagonalMayor, diagonalMenor, lado);
                System.out.println("Área del rombo: " + rombo.calcularArea());
                System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());
            } else {
                System.out.println("Opción no válida.");
            }
        } 
            System.out.println("Error: Entrada inválida. Debe ingresar un número.");
        }
    }
}


