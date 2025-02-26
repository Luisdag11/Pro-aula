/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCuentaBancaria;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner; // Importamos Scanner para entrada de usuario

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear Scanner

        // Pedir al usuario que ingrese el número de cuenta
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        // Pedir al usuario que ingrese el tipo de cuenta
        System.out.print("Ingrese el tipo de cuenta (Ahorros/Corriente): ");
        String tipoCuenta = scanner.nextLine();

        // Pedir al usuario que ingrese el saldo inicial con validación
        double saldo;
        do {
            System.out.print("Ingrese el saldo inicial: ");
            while (!scanner.hasNextDouble()) { // Verificar que sea un número
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Descartar entrada inválida
            }
            saldo = scanner.nextDouble();
            if (saldo < 0) {
                System.out.println("Error: El saldo no puede ser negativo.");
            }
        } while (saldo < 0); // Repetir hasta que el saldo sea válido

        // Crear un objeto CuentaBancaria con los datos ingresados
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        
        // Mostrar detalles de la cuenta
        cuenta.mostrarDetalles();

        scanner.close(); // Cerrar Scanner
    }
}