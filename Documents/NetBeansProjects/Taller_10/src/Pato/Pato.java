/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pato;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Pato implements Volador, Nadador {
    private String nombre;

    // Constructor
    public Pato(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método volar
    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    // Implementación del método nadar
    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}