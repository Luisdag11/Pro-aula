/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    // Constructor para ingresar el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método hablar
    @Override
    public void hablar() {
        System.out.println(nombre + " dice: ¡Hola! ¿Cómo estás?");
    }

    // Implementación del método trabajar
    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}
