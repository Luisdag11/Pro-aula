/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploError;

/**
 *
 * @author Luis Daniel Garavito
 */
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase derivada que sobrescribe sin modificar el comportamiento
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        super.hacerSonido(); // Llama al método de la superclase sin cambios
    }
}

// Clase de prueba
public class PruebaMalaPractica {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.hacerSonido(); // No aporta ninguna diferencia respecto a la superclase
    }
}