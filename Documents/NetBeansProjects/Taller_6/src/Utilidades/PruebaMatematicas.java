/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Menú de operaciones
        System.out.println("\n📌 OPERACIONES DISPONIBLES:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado = Matematicas.suma(num1, num2);
                System.out.println("➕ Suma: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = Matematicas.resta(num1, num2);
                System.out.println("➖ Resta: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = Matematicas.multiplicacion(num1, num2);
                System.out.println("✖️ Multiplicación: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                resultado = Matematicas.division(num1, num2);
                if (!Double.isNaN(resultado)) {
                    System.out.println("➗ División: " + num1 + " / " + num2 + " = " + resultado);
                }
                break;
            default:
                operacionValida = false;
                System.out.println("❌ Opción inválida, intente nuevamente.");
        }

        scanner.close();
    }
}
