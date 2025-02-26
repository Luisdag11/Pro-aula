/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_1.base;

/**
 *
 * @author Luis Daniel Garavito
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Cuenta de ahorros";
    }

    // Constructor con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicial en 0
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método toString()
    @Override
    public String toString() {
        return "🏦 Cuenta Bancaria\nNúmero de Cuenta: " + numeroCuenta + "\nSaldo: $" + saldo + "\nTipo de Cuenta: " + tipoCuenta;
    }
}
