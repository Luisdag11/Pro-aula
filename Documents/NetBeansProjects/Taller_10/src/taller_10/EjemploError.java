/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_10;

/**
 *
 * @author Luis Daniel Garavito
 */
// Clase abstracta con un método "predeterminado"
public abstract class Figura {
    public abstract double calcularArea();

    // No es posible definir un método "default" en una clase abstracta
    public default void mostrarInfo() {
        System.out.println("Soy una figura.");
    }
}
//La palabra clave default solo puede usarse en interfaces en Java, no en clases abstractas.
//Las clases abstractas pueden tener métodos concretos, pero no métodos default.