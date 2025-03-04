/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

// Clase Producto (Solo maneja los datos del producto)
class Producto {
    private String nombre;
    private double precioBase;
    private String categoria;

    public Producto(String nombre, double precioBase, String categoria) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getCategoria() {
        return categoria;
    }
}

// Clase EtiquetaProducto (Genera etiquetas con información del producto)
class EtiquetaProducto {
    public static String generarEtiqueta(Producto producto) {
        return " Producto: " + producto.getNombre() + "\n"
             + " Categoría: " + producto.getCategoria();
    }
}

// Clase CalculadoraPrecio (Calcula el precio final con impuestos o descuentos)
class CalculadoraPrecio {
    private static final double IMPUESTO = 0.15;  // 15% de IVA

    public static double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() * (1 + IMPUESTO);
    }
}

// Clase PruebaProducto (Ingreso de datos y ejecución)
public class PruebaProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print(" Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print(" Ingrese el precio base: ");
        double precioBase = scanner.nextDouble();
        scanner.nextLine(); // Consumir la línea

        System.out.print(" Ingrese la categoría: ");
        String categoria = scanner.nextLine();

        // Crear el objeto Producto
        Producto producto = new Producto(nombre, precioBase, categoria);

        // Mostrar la etiqueta del producto
        System.out.println("\n Etiqueta del Producto:");
        System.out.println(EtiquetaProducto.generarEtiqueta(producto));

        // Calcular y mostrar el precio final
        double precioFinal = CalculadoraPrecio.calcularPrecioFinal(producto);
        System.out.println("\n Precio Final con Impuesto (15%): $" + precioFinal);

        scanner.close();
    }
}