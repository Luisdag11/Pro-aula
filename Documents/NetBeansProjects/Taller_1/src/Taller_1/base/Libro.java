/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_1.base;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString()
    @Override
    public String toString() {
        return "📖 Libro: " + titulo + "\nAutor: " + autor + "\nNúmero de páginas: " + numeroPaginas;
    }
}