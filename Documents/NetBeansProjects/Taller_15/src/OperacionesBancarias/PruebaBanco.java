/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperacionesBancarias;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Interfaz para transferencias
interface Transferencia {
    void transferir(double monto, String cuentaDestino);
}

//  Interfaz para retiros
interface Retiro {
    void retirar(double monto);
}

//  Interfaz para pagos de facturas
interface PagoFacturas {
    void pagarFactura(String servicio, double monto);
}

//  Clase CuentaBancaria que implementa transferencias y retiros
class CuentaBancaria implements Transferencia, Retiro {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println(" Transferencia de $" + monto + " a " + cuentaDestino + " realizada con éxito.");
        } else {
            System.out.println(" Fondos insuficientes para la transferencia.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println(" Retiro de $" + monto + " realizado con éxito.");
        } else {
            System.out.println(" Fondos insuficientes para el retiro.");
        }
    }

    public void mostrarSaldo() {
        System.out.println(" Saldo actual: $" + saldo);
    }
}

//  Clase BilleteraVirtual que solo implementa pagos de facturas
class BilleteraVirtual implements PagoFacturas {
    private double saldo;

    public BilleteraVirtual(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println(" Pago de $" + monto + " para " + servicio + " realizado con éxito.");
        } else {
            System.out.println(" Fondos insuficientes para pagar la factura.");
        }
    }
    
    public void mostrarSaldo() {
        System.out.println(" Saldo en billetera virtual: $" + saldo);
    }
}

//  Clase de prueba para interactuar con el sistema
public class PruebaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        BilleteraVirtual billetera = new BilleteraVirtual(500);

        while (true) {
            System.out.println("\nMenú de Operaciones Bancarias:");
            System.out.println("1. Transferir dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Pagar factura");
            System.out.println("4. Ver saldo de la cuenta bancaria");
            System.out.println("5. Ver saldo de la billetera virtual");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 6) {
                System.out.println(" Saliendo del sistema...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferir = scanner.nextDouble();
                    System.out.print("Ingrese la cuenta destino: ");
                    String cuentaDestino = scanner.next();
                    cuenta.transferir(montoTransferir, cuentaDestino);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetirar = scanner.nextDouble();
                    cuenta.retirar(montoRetirar);
                    break;
                case 3:
                    System.out.print("Ingrese el servicio a pagar: ");
                    String servicio = scanner.next();
                    System.out.print("Ingrese el monto de la factura: ");
                    double montoFactura = scanner.nextDouble();
                    billetera.pagarFactura(servicio, montoFactura);
                    break;
                case 4:
                    cuenta.mostrarSaldo();
                    break;
                case 5:
                    billetera.mostrarSaldo();
                    break;
                default:
                    System.out.println(" Opción inválida. Inténtelo de nuevo.");
            }
        }
        
        scanner.close();
    }
}

