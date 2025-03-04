/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestorLibros;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

// Clase Libro (Modelo del libro)
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anioPublicacion;
    }
}

// Clase GestorLibros (Gestión de libros)
class GestorLibros {
    private List<Libro> listaLibros;

    public GestorLibros() {
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }
}

// Clase ReporteLibro (Mostrar información)
class ReporteLibro {
    public static void mostrarReporte(List<Libro> libros) {
        System.out.println("\n--- Reporte de Libros ---");
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInformacion());
        }
    }
}

// Clase PersistenciaLibro (Guardar en archivo)
class PersistenciaLibro {
    public static void guardarLibros(List<Libro> libros) {
        try (FileWriter writer = new FileWriter("libros.txt")) {
            for (Libro libro : libros) {
                writer.write(libro.mostrarInformacion() + "\n");
            }
            System.out.println("\n Datos guardados en libros.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar los libros: " + e.getMessage());
        }
    }
}

// Clase PruebaLibro (Ingresar datos y ejecutar)
public class PruebaLibro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorLibros gestor = new GestorLibros();

        System.out.print("¿Cuántos libros deseas agregar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n Ingresando libro " + (i + 1));

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Año de publicación: ");
            int anio = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            Libro libro = new Libro(titulo, autor, anio);
            gestor.agregarLibro(libro);
        }

        // Mostrar los libros ingresados
        ReporteLibro.mostrarReporte(gestor.obtenerLibros());

        // Guardar en un archivo
        PersistenciaLibro.guardarLibros(gestor.obtenerLibros());

        scanner.close();
    }
}