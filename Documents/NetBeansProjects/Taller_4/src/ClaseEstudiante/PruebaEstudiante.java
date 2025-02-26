/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseEstudiante;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad;
        while (!scanner.hasNextInt()) { // Validación de número entero
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next(); // Descartar entrada inválida
        }
        edad = scanner.nextInt();

        System.out.print("Ingrese la nota promedio del estudiante: ");
        double nota;
        while (!scanner.hasNextDouble()) { // Validación de número decimal
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next();
        }
        nota = scanner.nextDouble();

        // Crear objeto Estudiante
        Estudiante estudiante = new Estudiante(nombre, edad, nota);

        // Mostrar información del estudiante
        System.out.println("\nInformación del Estudiante:");
        estudiante.mostrarInformacion();

        scanner.close();
    }
}