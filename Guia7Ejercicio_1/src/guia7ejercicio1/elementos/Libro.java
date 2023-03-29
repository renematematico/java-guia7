/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1.elementos;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Libro {
    
    /////////////////ATRIBUTOS////////////////
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;   
    
    
    /////////////////COSNTRUCTORES////////////////
//CONSTRUCTOR sin parámetros
    public Libro() {
    }
//CONSTRUCTOR con parámetros
    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    //////////////////MÉTODOS////////////////////
    public void cargarLibro(){
        Scanner leer=new Scanner(System.in);
        Scanner leer2=new Scanner(System.in);
        System.out.println("Ingresar código ISBN");        
        this.ISBN = leer.nextInt();
        System.out.println("Ingresar Título");
        this.titulo = leer2.nextLine();
        System.out.println("Ingresar Autor");
        this.autor = leer2.next();
        System.out.println("Ingresar Número de Páginas");
        this.numPag = leer.nextInt();    
    }
    
    //////////////////TO STRING////////////////////

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }

    
    
    
}
