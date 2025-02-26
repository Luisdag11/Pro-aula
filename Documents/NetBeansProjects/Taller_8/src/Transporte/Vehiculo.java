/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    // Constructor
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
