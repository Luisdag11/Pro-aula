/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0; // Atributo estático para contar los coches

    // Constructor que incrementa el contador cada vez que se crea un objeto
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Incrementamos el contador
    }

    // Método para mostrar la información del coche
    public void mostrarInfo() {
        System.out.println(" Coche: " + marca + " " + modelo);
    }

    // Método estático para obtener el número total de coches creados
    public static void mostrarTotalCoches() {
        System.out.println(" Total de coches creados: " + contadorCoches);
    }
}