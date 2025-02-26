/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseUtilidades;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner; // Importamos Scanner para entrada de usuario

public class PruebaUtilidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear Scanner

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Mostrar resultados de las operaciones
        System.out.println("Suma: " + Utilidades.sumar(num1, num2));
        System.out.println("Resta: " + Utilidades.restar(num1, num2));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(num1, num2));
        System.out.println("División: " + Utilidades.dividir(num1, num2));

        scanner.close(); // Cerrar Scanner
    }
}
