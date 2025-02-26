/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Pez implements Nadador, Respirador {
    private String especie;

    // Constructor
    public Pez(String especie) {
        this.especie = especie;
    }

    // Implementación del método nadar
    @Override
    public void nadar() {
        System.out.println("El " + especie + " está nadando ágilmente en el agua.");
    }

    // Implementación del método respirar
    @Override
    public void respirar() {
        System.out.println("El " + especie + " está respirando bajo el agua con sus branquias.");
    }

    // Método para mostrar información del pez
    public void mostrarInformacion() {
        System.out.println("Especie: " + especie);
    }
}