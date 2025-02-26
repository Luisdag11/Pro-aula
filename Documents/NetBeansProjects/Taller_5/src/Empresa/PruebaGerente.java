/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaGerente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del gerente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario del gerente: ");
        double salario;
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next();
        }
        salario = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el departamento del gerente: ");
        String departamento = scanner.nextLine();

        // Crear objeto Gerente
        Gerente gerente = new Gerente(nombre, salario, departamento);

        // Mostrar la información del gerente
        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarInformacion();

        scanner.close();
    }
}
