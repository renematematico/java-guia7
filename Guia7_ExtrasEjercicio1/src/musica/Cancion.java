/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Cancion {

    ///////////////////////ATRIBUTOS//////////////////////
    private String titulo;
    private String autor;
    ///////////////////////CONSTRUCTORES//////////////////////
    public Cancion() {
    }
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    ///////////////////////GETTERS//////////////////////
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    } 
    ///////////////////////SETTERS//////////////////////
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    ///////////////////////MÉTODOS FUNCIONALES//////////////////////
    public void crearCancion(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar el TÍTULO de la canción.");
        titulo=leer.nextLine();
        System.out.println("Ingresar el AUTOR de la canción.");
        autor=leer.nextLine();
    }
    ///////////////////////TO STRING//////////////////////

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    



   
}
