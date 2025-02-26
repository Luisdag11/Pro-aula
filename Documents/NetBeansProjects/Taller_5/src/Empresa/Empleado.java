/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Empleado {
    // Propiedades protected (accesibles en subclases)
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar información del empleado
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
