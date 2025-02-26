/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseEmpleado;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner; // Importamos Scanner para entrada de usuario

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear Scanner

        // Pedir al usuario que ingrese el nombre
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        // Pedir al usuario que ingrese el salario
        double salario;
        do {
            System.out.print("Ingrese el salario del empleado: ");
            while (!scanner.hasNextDouble()) { // Verificar que sea un número
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Descartar entrada inválida
            }
            salario = scanner.nextDouble();
            if (salario < 0) {
                System.out.println("Error: El salario no puede ser negativo.");
            }
        } while (salario < 0); // Repetir hasta que el salario sea válido

        // Crear un objeto Empleado con los datos ingresados
        Empleado emp1 = new Empleado(nombre, salario);
        emp1.mostrarInfo(); // Mostrar información del empleado

        scanner.close(); // Cerrar Scanner
    }
}
