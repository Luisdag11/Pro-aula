/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_3.producto;

/**
 *
 * @author Luis Daniel Garavito
 */
public class PruebaProducto {
     public static void main(String[] args) {
        // Crear un producto usando el constructor con acceso de paquete
        Producto producto1 = new Producto("Perfume Elegante", 59.99, 20);
        
        // Acceder a las propiedades (posible porque están en el mismo paquete)
        System.out.println("Nombre: " + producto1.nombre);
        System.out.println("Precio: $" + producto1.precio);
        System.out.println("Stock: " + producto1.stock);

        // Llamar al método mostrarInfo()
        producto1.mostrarInfo();
    }
}
