/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extrasejerccio5;

import elementos.Cuenta;

/**
 *
 * @author crist
 */
public class Guia7_ExtrasEjerccio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c0001 = new Cuenta(2000, "Cristian");
        
        System.out.println(c0001.toString());
        
        c0001.retirarDinero();
        
    }
    
}

