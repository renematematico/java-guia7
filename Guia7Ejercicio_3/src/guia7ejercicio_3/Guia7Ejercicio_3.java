/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio_3;

import clases.Operacion;

/**
 *
 * @author crist
 */
public class Guia7Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion par1=new Operacion();
        
        par1.crearOperacion();
        
        System.out.println("La suma de los valores es "+par1.sumar());
        
        System.out.println("La resta de los valores es "+par1.restar());
        
        par1.multiplicar();
        
        par1.dividir();
        
        
    }
    
}
