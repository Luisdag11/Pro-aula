/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseEmpleado;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Empleado {
    public String nombre; // Propiedad pública
    private double salario; // Propiedad privada

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    // Método getter para salario
    public double getSalario() {
        return salario;
    }

    // Método setter con validación
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }

    // Método para mostrar información del empleado
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + ", Salario: $" + salario);
    }
}

