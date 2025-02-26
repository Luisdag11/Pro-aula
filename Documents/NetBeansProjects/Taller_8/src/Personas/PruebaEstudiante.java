/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese la matrícula del estudiante: ");
        String matricula = scanner.nextLine();

        // Crear objeto Estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(nombre, edad, matricula);

        // Mostrar información del estudiante
        System.out.println("\nInformación del Estudiante:");
        estudiante.mostrarInformacion();

        scanner.close();
    }
}
