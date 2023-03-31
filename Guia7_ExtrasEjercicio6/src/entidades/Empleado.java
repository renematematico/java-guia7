/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Empleado {
///////////ATRIBUTOS///////////
    public String nombre;
    public int edad;
    public double salario;
    
///////////CONSTRUCTORES///////////
    public Empleado() {
    }
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    } 
    
///////////GETTERS///////////

///////////SETTERS///////////
///////////METODOS FUNCIONALES///////////
    public void cargarEmpleado(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar nombre de empleado.");
        nombre=leer.nextLine();
        System.out.println("Ingresar edad.");
        edad=leer.nextInt();
        System.out.println("Ingresar salario nominal.");
        salario=leer.nextDouble();
    }
    public void calcularAumento(){
        if(edad<30){
        //System.out.println("El empleado "+nombre+" tiene "+edad+" años.");
        System.out.println("Le corresponde un aumento del 5%");
        System.out.println("El monto a cobrar = $"+(double)Math.round(salario*1.05));        
        }
        if(edad>=30){
        //System.out.println("El empleado "+nombre+" tiene "+edad+" años.");
        System.out.println("Le corresponde un aumento del 10%");
        System.out.println("El monto a cobrar = $"+(double)Math.round(salario*1.1));        
        }
    }
///////////TO STRING///////////

    @Override
    public String toString() {
        return "Empleado{" + "nombre= " + nombre + ", edad= " + edad + "años, salario= $" + salario + '}';
    }
    

   
    
}
