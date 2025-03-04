/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemareportes;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Interfaz para la generación de reportes
interface GeneradorReporte {
    void generarReporte(String contenido);
}

//  Implementación de Reporte PDF
class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println(" Generando reporte en PDF...");
        System.out.println(" Contenido: " + contenido);
    }
}

//  Implementación de Reporte Excel
class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println(" Generando reporte en Excel...");
        System.out.println(" Contenido: " + contenido);
    }
}

//  Clase que gestiona los reportes
class GestorReportes {
    private GeneradorReporte generadorReporte;

    // Inyección de dependencia a través del constructor
    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generar(String contenido) {
        generadorReporte.generarReporte(contenido);
    }
}

//  Clase de prueba para ejecutar el sistema de reportes
public class PruebaReportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el formato del reporte:");
        System.out.println("1. PDF");
        System.out.println("2. Excel");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        GeneradorReporte generador = null;

        if (opcion == 1) {
            generador = new ReportePDF();
        } else if (opcion == 2) {
            generador = new ReporteExcel();
        } else {
            System.out.println(" Opción inválida.");
            return;
        }

        // Crear el gestor de reportes con la implementación seleccionada
        GestorReportes gestor = new GestorReportes(generador);

        // Solicitar el contenido del reporte
        System.out.print("Ingrese el contenido del reporte: ");
        String contenido = scanner.nextLine();

        // Generar el reporte
        gestor.generar(contenido);

        scanner.close();
    }
}

