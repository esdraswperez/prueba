/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraplicacion;

import java.util.Scanner;

/**
 *
 * @author esdras.perez
 */
public class PrimerAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        
        System.out.println("La edad ingrtesada es: " + edad);
    }
    
}
