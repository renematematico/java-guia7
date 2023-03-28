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
        double radio = crearCircunferencia();
        Circunferencia c1 = new Circunferencia(radio);
        
        System.out.println(c1.getRadio());
        
    }
    
    public static double crearCircunferencia(){
    double radio;
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio=leer.nextDouble();
        return radio;
    }
    
}
