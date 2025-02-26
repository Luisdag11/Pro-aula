/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Vendedor extends Empleado {
    private double comision;
    private int ventas;

    // Constructor
    public Vendedor(String nombre, double salarioBase, double comision, int ventas) {
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventas = ventas;
    }

    // Implementación del método calcularSalario()
    @Override
    public double calcularSalario() {
        return salarioBase + (comision * ventas);
    }
}