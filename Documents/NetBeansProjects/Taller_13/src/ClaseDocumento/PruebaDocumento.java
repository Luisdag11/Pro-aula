/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseDocumento;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Clase base Documento (Interfaz para exportación)
interface ExportadorDocumento {
    void exportar(String contenido);
}

// Exportación a PDF
class ExportadorPDF implements ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println(" Exportando a PDF con contenido:\n" + contenido);
    }
}

// Nuevo: Exportación a Word (Extiende sin modificar el código existente)
class ExportadorWord implements ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println(" Exportando a Word con contenido:\n" + contenido);
    }
}

//  Nuevo: Exportación a Excel
class ExportadorExcel implements ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println(" Exportando a Excel con contenido:\n" + contenido);
    }
}

//  Clase principal (Permite ingresar datos y elegir formato)
public class PruebaDocumento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Entrada de datos por el usuario
        System.out.print(" Ingrese el contenido del documento: ");
        String contenido = scanner.nextLine();

        System.out.println("\nSeleccione el formato de exportación:");
        System.out.println("1. PDF");
        System.out.println("2. Word");
        System.out.println("3. Excel");
        System.out.print("Ingrese su opción (1-3): ");
        int opcion = scanner.nextInt();

        //  Crear el exportador correspondiente
        ExportadorDocumento exportador;
        switch (opcion) {
            case 1:
                exportador = new ExportadorPDF();
                break;
            case 2:
                exportador = new ExportadorWord();
                break;
            case 3:
                exportador = new ExportadorExcel();
                break;
            default:
                System.out.println(" Opción no válida.");
                scanner.close();
                return;
        }

        //  Exportar el documento
        exportador.exportar(contenido);
        scanner.close();
    }
}
