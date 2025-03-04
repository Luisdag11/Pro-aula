/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseMensajero;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Interfaz base para el envío de mensajes
interface Mensajero {
    void enviarMensaje(String destinatario, String mensaje);
}

//  Implementación para enviar correos electrónicos
class MensajeroEmail implements Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println(" Enviando Email a " + destinatario + ":\n" + mensaje);
    }
}

//  Implementación para enviar SMS
class MensajeroSMS implements Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println(" Enviando SMS a " + destinatario + ":\n" + mensaje);
    }
}

//  Implementación para enviar Notificaciones Push
class MensajeroPush implements Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println(" Enviando Notificación Push a " + destinatario + ":\n" + mensaje);
    }
}

//  Clase principal para probar el sistema
public class PruebaMensajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Entrada de datos por el usuario
        System.out.print(" Ingrese el destinatario: ");
        String destinatario = scanner.nextLine();

        System.out.print("️ Ingrese el mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.println("\nSeleccione el método de envío:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Notificación Push");
        System.out.print("Ingrese su opción (1-3): ");
        int opcion = scanner.nextInt();

        //  Crear el mensajero correspondiente
        Mensajero mensajero;
        switch (opcion) {
            case 1:
                mensajero = new MensajeroEmail();
                break;
            case 2:
                mensajero = new MensajeroSMS();
                break;
            case 3:
                mensajero = new MensajeroPush();
                break;
            default:
                System.out.println(" Opción no válida.");
                scanner.close();
                return;
        }

        //  Enviar el mensaje
        mensajero.enviarMensaje(destinatario, mensaje);
        scanner.close();
    }
}