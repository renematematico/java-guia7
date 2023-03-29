/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio_4.figurasGeometricas;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Rectangulo {
    
    ////////////////ATRIBUTOS////////////////
    private int base;
    private int altura;

    ////////////////CONSTRUCTORES////////////////
    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    ////////////////GETTERS////////////////
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    ////////////////SETTERS////////////////
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
////////////////METODOS FUNCIONALES//////////////// 
    public void crearRectangulo(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar el valor de la base:");
        base=leer.nextInt();
        System.out.println("Ingresar el valor de la altura:");
        altura=leer.nextInt();
    }
    
    public int area(){
    int area=base*altura;
    return area;
    }
    public double perimetro(){
    double perimetro =2*(base+altura);
    return perimetro;
    }
    public void dibujar() {
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < altura-2; i++) {
            System.out.print("*");
            for (int j = 0; j < base - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }        
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println("");

    
    }
    
    
////////////////TO STRING////////////////

   

    
    
}
