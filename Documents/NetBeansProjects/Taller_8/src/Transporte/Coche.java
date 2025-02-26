/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    // Constructor
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Método para mostrar información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}