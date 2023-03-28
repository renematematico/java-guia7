/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio_1;

import java.util.Scanner;
import libro.Libro;

/**
 *
 * @author crist
 */
public class Guia7Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Libro libro1=new Libro();
        
        cargarLibro(libro1, libro1.ISBN,libro1.titulo,libro1.autor, libro1.numPag);
        
              
      
        mostrarLibro(libro1.ISBN,libro1.titulo,libro1.autor,libro1.numPag);
    }
    
    public static void cargarLibro(Libro libro1,int ISBN, String titulo, String autor, int numPag){
  
    Scanner leer=new Scanner (System.in);
    Scanner leer1=new Scanner (System.in);
        
        System.out.println("Ingrese el ISBN del libro");
        libro1.ISBN=leer.nextInt();
        System.out.println("Ingrese el Título del libro");
        libro1.titulo=leer1.nextLine();        
        System.out.println("Ingrese el Autor del libro");
        libro1.autor=leer1.nextLine();
        System.out.println("Ingrese el Número de Páginas");
        libro1.numPag=leer.nextInt();
    }
    
    public static void mostrarLibro(int ISBN, String titulo, String autor, int numPag){
        System.out.println("El ISBN "+ISBN+", Título "+titulo+", autor: "+autor+", Número de páginas: "+numPag);
    }
    
}
