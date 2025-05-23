/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.pb.datos;

import java.util.HashMap;

/** 
 *
 * @author Luis Garavito
 */
public class Visitante {
    public String nombre;  
    public String telefono; 
    public String documento; 
    public String email;
    public String ocupacion;
    
    public static HashMap<String, Visitante> visitantesBD;
}
