/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione una figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        Figura figura; // Referencia de tipo Figura para polimorfismo

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(radio);
                break;
            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                figura = new Rectangulo(base, altura);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        // Mostrar el área utilizando polimorfismo
        figura.mostrarArea();
        
        scanner.close();
    }
}