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

public class PruebaEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de empleado:");
        System.out.println("1. Gerente");
        System.out.println("2. Vendedor");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        Empleado empleado; // Referencia de tipo Empleado para polimorfismo

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del gerente: ");
                scanner.nextLine(); // Consumir salto de línea
                String nombreGerente = scanner.nextLine();
                System.out.print("Ingrese el salario base del gerente: ");
                double salarioBaseGerente = scanner.nextDouble();
                System.out.print("Ingrese el bono del gerente: ");
                double bono = scanner.nextDouble();

                empleado = new Gerente(nombreGerente, salarioBaseGerente, bono);
                break;

            case 2:
                System.out.print("Ingrese el nombre del vendedor: ");
                scanner.nextLine(); // Consumir salto de línea
                String nombreVendedor = scanner.nextLine();
                System.out.print("Ingrese el salario base del vendedor: ");
                double salarioBaseVendedor = scanner.nextDouble();
                System.out.print("Ingrese la comisión por venta: ");
                double comision = scanner.nextDouble();
                System.out.print("Ingrese la cantidad de ventas: ");
                int ventas = scanner.nextInt();

                empleado = new Vendedor(nombreVendedor, salarioBaseVendedor, comision, ventas);
                break;

            default:
                System.out.println("❌ Opción inválida.");
                return;
        }

        // Mostrar detalles usando polimorfismo
        empleado.mostrarDetalles();

        scanner.close();
    }
}
