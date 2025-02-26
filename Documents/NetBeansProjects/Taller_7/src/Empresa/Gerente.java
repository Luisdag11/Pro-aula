/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Gerente extends Empleado {
    private double bono;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Implementación del método calcularSalario()
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
