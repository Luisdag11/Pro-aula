/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Matematicas {
    // Método para sumar
    public static double suma(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double resta(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // Método para dividir con validación de división por cero
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println(" Error: No se puede dividir por cero.");
            return Double.NaN; // Retorna NaN (Not a Number)
        }
        return a / b;
    }
}