/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCuentaBancaria;

/**
 *
 * @author Luis Daniel Garavito
 */
public class CuentaBancaria {
    private String numeroCuenta; // Propiedad privada
    private double saldo; // Propiedad privada
    public String tipoCuenta; // Propiedad pública

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método setter para saldo con validación
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }
    }

    // Método público para mostrar detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Cuenta Bancaria:");
        System.out.println("Número de Cuenta: [Privado]");
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
