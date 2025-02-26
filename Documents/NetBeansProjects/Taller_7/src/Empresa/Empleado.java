/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author Luis Daniel Garavito
 */
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}