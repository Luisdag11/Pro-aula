/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmArchivos;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//  Interfaz para definir el almacenamiento de archivos
interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}

//  Implementación de almacenamiento en local
class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> almacenamientoLocal = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        almacenamientoLocal.put(nombre, contenido);
        System.out.println(" Archivo guardado en almacenamiento local: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return almacenamientoLocal.getOrDefault(nombre, "❌ Archivo no encontrado en almacenamiento local.");
    }
}

//  Implementación de almacenamiento en la nube
class AlmacenamientoNube implements Almacenamiento {
    private Map<String, String> almacenamientoNube = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        almacenamientoNube.put(nombre, contenido);
        System.out.println("️ Archivo guardado en la nube: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return almacenamientoNube.getOrDefault(nombre, "❌ Archivo no encontrado en la nube.");
    }
}

//  Clase que gestiona el almacenamiento de archivos
class GestorArchivos {
    private Almacenamiento almacenamiento;

    // Inyección de dependencia a través del constructor
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public void recuperar(String nombre) {
        String contenido = almacenamiento.recuperarArchivo(nombre);
        System.out.println(" Contenido del archivo: " + contenido);
    }
}

//  Clase de prueba para ejecutar el sistema
public class PruebaAlmacenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de almacenamiento:");
        System.out.println("1. Almacenamiento Local");
        System.out.println("2. Almacenamiento en la Nube");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Almacenamiento almacenamiento = null;

        if (opcion == 1) {
            almacenamiento = new AlmacenamientoLocal();
        } else if (opcion == 2) {
            almacenamiento = new AlmacenamientoNube();
        } else {
            System.out.println(" Opción inválida.");
            return;
        }

        // Crear gestor de archivos con la implementación seleccionada
        GestorArchivos gestor = new GestorArchivos(almacenamiento);

        // Operaciones con archivos
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        System.out.print("Ingrese el contenido del archivo: ");
        String contenidoArchivo = scanner.nextLine();

        // Guardar archivo
        gestor.guardar(nombreArchivo, contenidoArchivo);

        // Recuperar archivo
        System.out.print("\nIngrese el nombre del archivo a recuperar: ");
        String nombreRecuperar = scanner.nextLine();
        gestor.recuperar(nombreRecuperar);

        scanner.close();
    }
}

