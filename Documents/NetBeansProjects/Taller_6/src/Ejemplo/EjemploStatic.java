/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;

/**
 *
 * @author Luis Daniel Garavito
 */
public class EjemploStatic {
    private static int contador = 0; // Ahora el atributo es estático
    public static void incrementarContador() {
        contador++;
        System.out.println("Contador: " + contador);
    }

    public static void main(String[] args) {
        incrementarContador(); // Llamada válida
        incrementarContador(); // Se incrementa correctamente
    }
}

//No podemos acceder un atributo de instancia desde un metodo estatico porque los atributos de instancia requieren que haya un objeto credo
//Los métodos estáticos pueden ejecutarse sin crear una instancia de la clase.

