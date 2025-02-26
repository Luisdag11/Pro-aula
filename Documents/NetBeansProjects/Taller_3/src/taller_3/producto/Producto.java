/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_3.producto;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Producto {
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método con acceso de paquete
    void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio + ", Stock: " + stock);
    }
}
