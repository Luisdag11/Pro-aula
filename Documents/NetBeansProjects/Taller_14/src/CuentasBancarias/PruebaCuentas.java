/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasBancarias;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Clase base CuentaBancaria
abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println(" Depósito realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println(" Monto inválido.");
        }
    }

    public abstract void retirar(double monto); // Método abstracto

    public double getSaldo() {
        return saldo;
    }
}

//  Clase derivada CuentaAhorros
class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        double interes = saldo * tasaInteres / 100;
        saldo += interes;
        System.out.println(" Interés aplicado: $" + interes + ". Nuevo saldo: $" + saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println(" Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println(" Fondos insuficientes o monto inválido.");
        }
    }
}

//  Clase principal para probar el sistema
public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //  Crear una cuenta de ahorros
        System.out.print("Ingrese saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        System.out.print("Ingrese tasa de interés (%): ");
        double tasaInteres = scanner.nextDouble();
        
        CuentaBancaria cuenta = new CuentaAhorros(saldoInicial, tasaInteres);

        //  Menú de operaciones
        int opcion;
        do {
            System.out.println("\nMenú de Cuenta Bancaria:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Aplicar interés");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    if (cuenta instanceof CuentaAhorros) {
                        ((CuentaAhorros) cuenta).aplicarInteres();
                    }
                    break;
                case 4:
                    System.out.println(" Saldo actual: $" + cuenta.getSaldo());
                    break;
                case 5:
                    System.out.println(" Saliendo del sistema.");
                    break;
                default:
                    System.out.println(" Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

