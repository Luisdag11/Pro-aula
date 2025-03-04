/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

//  Clase base Figura
abstract class Figura {
    public abstract double calcularArea();  // Método abstracto
}

//  Clase Circulo que extiende Figura
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

// ️ Clase Rectangulo que extiende Figura
class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

//  Clase principal para probar el sistema
public class PruebaFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura figura;  // Referencia de tipo Figura

        System.out.println("Seleccione la figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.print("Ingrese su opción (1-2): ");
        int opcion = scanner.nextInt();

        //  Pedir datos según la figura seleccionada
        if (opcion == 1) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            figura = new Circulo(radio);
        } else if (opcion == 2) {
            System.out.print("Ingrese la base del rectángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = scanner.nextDouble();
            figura = new Rectangulo(base, altura);
        } else {
            System.out.println(" Opción no válida.");
            scanner.close();
            return;
        }

        // Calcular y mostrar el área
        System.out.println("\nEl área de la figura seleccionada es: " + figura.calcularArea());
        scanner.close();
    }
}
