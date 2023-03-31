/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extrasejercicio6;

import entidades.Empleado;

/**
 *
 * @author crist
 */
public class Guia7_ExtrasEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado e001=new Empleado();
        
        e001.cargarEmpleado();
        
        System.out.println(e001.toString());
        e001.calcularAumento();
    }
    
}
