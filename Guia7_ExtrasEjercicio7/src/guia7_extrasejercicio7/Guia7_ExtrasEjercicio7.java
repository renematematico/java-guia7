/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extrasejercicio7;

import Figuras.Rectangulo;

/**
 *
 * @author crist
 */
public class Guia7_ExtrasEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo1=new Rectangulo(4, 6);
        System.out.println(rectangulo1.toString());
        
        System.out.println("");
        System.out.println("Perímetro del rectángulo");
        System.out.println("El perímetro del rectángulo es = "+rectangulo1.calcularPerimetro()+" cm");
        System.out.println("");        
        rectangulo1.dibujarPerimetro();
        System.out.println("");
        System.out.println("Área del rectángulo");
        System.out.println("El área del rectángulo es = "+rectangulo1.calcularArea()+" cm cuadrados");
        System.out.println("");
        rectangulo1.dibujarArea();
    }
    
}
