/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Financiero;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar saldo inicial
        System.out.print(" Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        Banco miBanco = new Banco(saldoInicial);

        // Menú de opciones
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n MENÚ DEL BANCO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" Saldo actual: $" + miBanco.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    miBanco.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    miBanco.retirar(retiro);
                    break;
                case 4:
                    System.out.println(" Saliendo del banco. ¡Gracias!");
                    continuar = false;
                    break;
                default:
                    System.out.println(" Opción inválida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}
