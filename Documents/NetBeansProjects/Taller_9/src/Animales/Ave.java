/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Ave implements Volador, Cantante {
    private String especie;

    // Constructor
    public Ave(String especie) {
        this.especie = especie;
    }

    // Implementación del método volar
    @Override
    public void volar() {
        System.out.println("El " + especie + " está volando alto en el cielo.");
    }

    // Implementación del método cantar
    @Override
    public void cantar() {
        System.out.println("El " + especie + " está cantando una hermosa melodía.");
    }

    // Método para mostrar información general del ave
    public void mostrarInformacion() {
        System.out.println("Especie: " + especie);
    }
}
