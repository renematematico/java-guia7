/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio_4;

import guia7ejercicio_4.figurasGeometricas.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Guia7Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        Rectangulo r1 =new Rectangulo();
        r1.crearRectangulo();
        System.out.println("");
        System.out.println("PERÍMETRO = "+r1.perimetro()+" centímetros");
        System.out.println("ÁREA = "+r1.area()+" centímetros cuadrados");
        System.out.println("");
        System.out.println("El rectángulo tiene la siguiente forma:");
        System.out.println("");
        r1.dibujar();
    }
    
}

