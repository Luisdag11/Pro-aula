/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.Unicolombo.pb;

import co.edu.Unicolombo.pb.vista.VistaPrincipal;



/**
 *
 * @author Luis Garavito
 */
public class Principal {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("prueba");
        VistaPrincipal v = new VistaPrincipal();
        v.pack();
        v.setExtendedState(VistaPrincipal.MAXIMIZED_BOTH);
        v.setVisible(true);
    }
    
}
