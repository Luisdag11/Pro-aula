/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos para un Empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Ingrese el salario del empleado: ");
        double salarioEmpleado = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear objeto Empleado
        Empleado empleado = new Empleado(nombreEmpleado, salarioEmpleado);

        // Ingresar datos para un Gerente
        System.out.print("\nIngrese el nombre del gerente: ");
        String nombreGerente = scanner.nextLine();

        System.out.print("Ingrese el salario del gerente: ");
        double salarioGerente = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el departamento del gerente: ");
        String departamento = scanner.nextLine();

        // Crear objeto Gerente
        Gerente gerente = new Gerente(nombreGerente, salarioGerente, departamento);

        // Mostrar detalles
        System.out.println("\nDetalles del Empleado:");
        empleado.mostrarDetalles();

        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();

        scanner.close();
    }
}