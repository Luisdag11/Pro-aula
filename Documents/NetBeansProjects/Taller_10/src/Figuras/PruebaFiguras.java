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

        // Ingresar datos para el rectángulo
        System.out.println("Ingrese la base del rectángulo:");
        double baseRect = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double alturaRect = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());

        // Ingresar datos para el triángulo
        System.out.println("Ingrese la base del triángulo:");
        double baseTri = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double alturaTri = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(baseTri, alturaTri);
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());

        scanner.close();
    }
}
