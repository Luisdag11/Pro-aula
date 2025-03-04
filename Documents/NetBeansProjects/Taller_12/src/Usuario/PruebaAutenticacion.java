/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Clase Usuario (Maneja datos del usuario)
class Usuario {
    private String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }
}

//  Clase ValidadorUsuario (Encargada de validar los datos ingresados)
class ValidadorUsuario {
    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean validarPassword(String password) {
        return password.length() >= 6;
    }
}

//  Clase ServicioAutenticacion (Encargada de manejar la autenticación)
class ServicioAutenticacion {
    private Usuario usuarioRegistrado;

    public ServicioAutenticacion(Usuario usuario) {
        this.usuarioRegistrado = usuario;
    }

    public boolean autenticar(String email, String password) {
        return usuarioRegistrado.getEmail().equals(email) &&
               usuarioRegistrado.getPassword().equals(password);
    }
}

//  Clase Principal (Permite Ingresar Datos y Ejecutar)
public class PruebaAutenticacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Entrada de datos por el usuario
        System.out.print(" Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print(" Ingrese su email: ");
        String email = scanner.nextLine();

        System.out.print(" Ingrese su contraseña: ");
        String password = scanner.nextLine();

        //  Validar email y contraseña
        if (!ValidadorUsuario.validarEmail(email)) {
            System.out.println("️ Error: El email no es válido.");
            return;
        }

        if (!ValidadorUsuario.validarPassword(password)) {
            System.out.println("️ Error: La contraseña debe tener al menos 6 caracteres.");
            return;
        }

        //  Crear usuario y servicio de autenticación
        Usuario usuario = new Usuario(nombre, email, password);
        ServicioAutenticacion authService = new ServicioAutenticacion(usuario);

        //  Solicitar inicio de sesión
        System.out.println("\n Iniciar Sesión");
        System.out.print(" Email: ");
        String loginEmail = scanner.nextLine();

        System.out.print(" Contraseña: ");
        String loginPassword = scanner.nextLine();

        //  Verificar credenciales
        if (authService.autenticar(loginEmail, loginPassword)) {
            System.out.println(" Bienvenido, " + usuario.getNombre() + "!");
        } else {
            System.out.println(" Error: Credenciales incorrectas.");
        }

        scanner.close();
    }
}