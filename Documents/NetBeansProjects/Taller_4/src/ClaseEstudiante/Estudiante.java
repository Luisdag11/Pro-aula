/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseEstudiante;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Estudiante {
    // Propiedades privadas
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.setNombre(nombre); // Usamos el setter para aplicar validaciones
        this.setEdad(edad);
        this.setNotaPromedio(notaPromedio);
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor que 0.");
        }
    }

    // Getter y Setter para notaPromedio
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 10.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 0 y 10.");
        }
    }

    // Método para mostrar detalles del estudiante
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nota Promedio: " + notaPromedio);
    }
}