/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio_2;

import Clase.Circunferencia;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el 
radio de tipo real. A continuación, se deben crear los siguientes métodos:

a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/

/**
 *
 * @author crist
 */
public class Guia7Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia c1=new Circunferencia();
        Circunferencia c2=new Circunferencia();
        
System.out.println("=====================================");
        System.out.println("Ingresar el RADIO para la circunferencia");
        c1.crearCircunferencia();
System.out.println("........................................");        
        System.out.println("El perímetro de la circunferencia es:");
        System.out.println(c1.perimCirc()+" centímetros");
System.out.println("........................................");                
        System.out.println("El área de la circunferencia es:");
        System.out.println(c1.areaCirc()+" centímetros cuadrados");
System.out.println("=====================================");        
        System.out.println("=====================================");
        System.out.println("Ingresar el RADIO para la circunferencia");
        c2.crearCircunferencia();
System.out.println("........................................");        
        System.out.println("El perímetro de la circunferencia es:");
        System.out.println(c2.perimCirc()+" centímetros");
System.out.println("........................................");                
        System.out.println("El área de la circunferencia es:");
        System.out.println(c2.areaCirc()+" centímetros cuadrados");
System.out.println("=====================================");        

    }
    
    
    
}
