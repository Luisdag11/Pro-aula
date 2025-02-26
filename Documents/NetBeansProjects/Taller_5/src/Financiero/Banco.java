/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Financiero;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Banco {
    private double saldo; // Ahora es privado

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("❌ Error: El saldo inicial no puede ser negativo. Se establecerá en 0.");
            this.saldo = 0;
        }
    }

    // Método para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("❌ Error: El monto a depositar debe ser positivo.");
        }
    }

    // Método para retirar dinero con validación
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
            return true;
        } else {
            System.out.println("❌ Error: Monto inválido o saldo insuficiente.");
            return false;
        }
    }
}
