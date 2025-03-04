/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaAutenticacion;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Interfaz para los servicios de autenticación
interface ServicioAutenticacion {
    boolean autenticar(String usuario, String clave);
}

//  Implementación de autenticación local (Base de Datos)
class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String clave) {
        // Simulando una base de datos
        if (usuario.equals("admin") && clave.equals("1234")) {
            System.out.println(" Autenticación local exitosa.");
            return true;
        } else {
            System.out.println(" Error en la autenticación local.");
            return false;
        }
    }
}

//  Implementación de autenticación mediante OAuth (Ejemplo con Google)
class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String clave) {
        // Simulando autenticación externa
        if (usuario.equals("user@gmail.com") && clave.equals("oauth-token")) {
            System.out.println(" Autenticación OAuth exitosa.");
            return true;
        } else {
            System.out.println(" Error en la autenticación OAuth.");
            return false;
        }
    }
}

//  Clase que gestiona la autenticación, dependiendo de la interfaz
class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    // Inyección de dependencia a través del constructor
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void autenticarUsuario(String usuario, String clave) {
        boolean resultado = servicioAutenticacion.autenticar(usuario, clave);
        if (resultado) {
            System.out.println(" Bienvenido, " + usuario + "!");
        } else {
            System.out.println("️ Acceso denegado.");
        }
    }
}

//  Clase de prueba para ejecutar el sistema
public class PruebaAutenticacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el método de autenticación:");
        System.out.println("1. Autenticación Local");
        System.out.println("2. Autenticación OAuth");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        ServicioAutenticacion servicio = null;

        if (opcion == 1) {
            servicio = new AutenticacionLocal();
        } else if (opcion == 2) {
            servicio = new AutenticacionOAuth();
        } else {
            System.out.println(" Opción inválida.");
            return;
        }

        // Crear gestor de autenticación con la implementación seleccionada
        GestorAutenticacion gestor = new GestorAutenticacion(servicio);

        // Solicitar credenciales
        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese contraseña/token: ");
        String clave = scanner.nextLine();

        // Intentar autenticación
        gestor.autenticarUsuario(usuario, clave);

        scanner.close();
    }
}
