/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author Luis Daniel Garavito
 */
public class PruebaPersona {
     public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona1 = new Persona("Carlos", 25);

        // Acceder a 'edad' directamente (porque es de paquete)
        System.out.println("Edad: " + persona1.edad);

        // Acceder a 'nombre' a través de los métodos get/set (porque es private)
        System.out.println("Nombre (antes): " + persona1.getNombre());
        persona1.setNombre("Luis");
        System.out.println("Nombre (después): " + persona1.getNombre());

        // Llamar al método mostrarInfo()
        persona1.mostrarInfo();
    }
}
