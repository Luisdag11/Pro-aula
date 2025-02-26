/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Empleado {
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
