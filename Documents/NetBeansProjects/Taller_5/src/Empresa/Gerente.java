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
    // Propiedad adicional
    private String departamento;

    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llamada al constructor de la superclase
        this.departamento = departamento;
    }

    // Sobreescribir el método mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        System.out.println("Gerente: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
    }
}