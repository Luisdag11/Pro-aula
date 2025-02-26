/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_1.base;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // ---------- CREAR UN LIBRO ----------
        
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        System.out.println("\n" + libro);

        // ---------- CREAR UNA CUENTA BANCARIA ----------
        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        System.out.println("\n" + cuenta);

        // ---------- CREAR UN ESTUDIANTE ----------
        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        System.out.println("\n" + estudiante);

        scanner.close();
    }
}