/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClaseDescuento;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Clase base Descuento (Maneja descuentos porcentuales)
abstract class Descuento {
    public abstract double aplicarDescuento(double precio);
}

//  Descuento Porcentual
class DescuentoPorcentual extends Descuento {
    private double porcentaje;

    public DescuentoPorcentual(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - (precio * (porcentaje / 100));
    }
}

//  Nuevo: Descuento Fijo (Extiende sin modificar Descuento)
class DescuentoFijo extends Descuento {
    private double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return Math.max(0, precio - cantidadFija); // Evita precios negativos
    }
}

//  Clase principal (Permite ingresar datos y probar el sistema)
public class PruebaDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Entrada de datos por el usuario
        System.out.print(" Ingrese el precio original del producto: ");
        double precio = scanner.nextDouble();

        System.out.print(" Ingrese el porcentaje de descuento (%): ");
        double porcentajeDescuento = scanner.nextDouble();

        System.out.print(" Ingrese el descuento fijo: ");
        double descuentoFijo = scanner.nextDouble();

        //  Crear objetos de descuento
        Descuento descuentoPorcentual = new DescuentoPorcentual(porcentajeDescuento);
        Descuento descuentoFijoObj = new DescuentoFijo(descuentoFijo);

        //  Aplicar descuentos
        double precioConDescuentoPorcentual = descuentoPorcentual.aplicarDescuento(precio);
        double precioConDescuentoFijo = descuentoFijoObj.aplicarDescuento(precio);

        //  Mostrar resultados
        System.out.println("\n Resultados:");
        System.out.printf(" Precio con descuento del %.2f%%: $%.2f\n", porcentajeDescuento, precioConDescuentoPorcentual);
        System.out.printf(" Precio con descuento fijo de $%.2f: $%.2f\n", descuentoFijo, precioConDescuentoFijo);

        scanner.close();
    }
}
