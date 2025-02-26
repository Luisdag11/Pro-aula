/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Animal {
    protected String especie;

    // Constructor
    public Animal(String especie) {
        this.especie = especie;
    }

    // Método para mostrar la especie
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
