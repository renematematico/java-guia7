/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author crist
 */
public class Rectangulo {

    //////////ATRIBUTOS
    public double lado1;
    public double lado2;

    //////////CONSTRUCTORES
    public Rectangulo() {
    }
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //////////METODOS FUNCIONALES
    public double calcularArea(){
    double area=lado1*lado2;
    return area;
            }
    public double calcularPerimetro(){
    double perim=(lado1+lado2)*2;
    return perim;
            }
    
    public void dibujarPerimetro(){
        //Dibujamos la primera línea llena
        for (int i = 0; i < lado1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        //Dibujamos el contorno de las siguientes
        for (int i = 0; i < lado2-2; i++) {
            System.out.print("*");
            for (int j = 0; j < lado1 - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }  
        
        //Dibujamos la última línea llena.
        for (int i = 0; i < lado1; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void dibujarArea(){
        for (int i = 0; i < lado2; i++) {
            for (int j = 0; j < lado1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
    
    /////////////////TO STRING

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + "cm, lado2=" + lado2 + "cm }";
    }
    
    
}
