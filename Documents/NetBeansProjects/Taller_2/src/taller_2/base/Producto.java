/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2.base;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Producto {
     private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + ", Precio: $" + String.format("%.2f", precio));
    }
}
