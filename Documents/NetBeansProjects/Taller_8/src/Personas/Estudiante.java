/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Estudiante extends Persona {
    private String matricula;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    // Método sobrescrito para mostrar información del estudiante
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base
        System.out.println("Matrícula: " + matricula);
    }
}