/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraPolimorfismo;

/**
 *
 * @author Luis Daniel Garavito
 */

import java.util.Scanner;
public class PruebaFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos para el círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(radio);

        // Solicitar datos para el rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura);

        // Calcular y mostrar áreas
        System.out.println("\nResultados:");
        circulo.calcularArea();
        rectangulo.calcularArea();

        scanner.close(); // Cerrar el scanner
    }
}