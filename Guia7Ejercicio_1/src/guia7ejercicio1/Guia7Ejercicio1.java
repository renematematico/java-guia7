/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;

import guia7ejercicio1.elementos.Libro;

/**
 *
 * @author crist
 */
public class Guia7Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1=new Libro();
        Libro libro2=new Libro();
        
        System.out.println("===========================");
        System.out.println("Ingresar Datos de Libro 1");
        System.out.println("===========================");
        libro1.cargarLibro();
        System.out.println(libro1.toString());
        System.out.println("===========================");        
        System.out.println("Ingresar Datos de Libro 2");
        System.out.println("===========================");
        libro2.cargarLibro();
        System.out.println(libro1.toString());
        
        
    }
    
    
    
}
