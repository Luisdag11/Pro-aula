/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Pez extends Animal {
    private String tipoDeAgua;

    // Constructor que llama al constructor de la clase base con super
    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Llama al constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    // Método para mostrar la información del pez
    public void mostrarDetalles() {
        super.mostrarEspecie(); // Llama al método de la clase base
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}
