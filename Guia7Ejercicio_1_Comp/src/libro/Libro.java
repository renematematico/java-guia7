/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author crist
 */
public class Libro {
    
/////////////ATRIBUTOS/////////////
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    /////////////CONSTRUCTORES/////////////
    
    //CONSTRUCTOR sin parámetros
    public Libro() {
    }
// CONSTRUCTOR con parámetros.
    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
/////////////MÉTODOS FUNCIONALES/////////////    


    
}
