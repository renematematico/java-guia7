/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Operacion {
    
/////////////ATRIBUTOS/////////////
    private double numero1;
    private double numero2;
    
/////////////CONSTRUCTORES/////////////
    public Operacion() {
    } 
   
     public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    
/////////////GETTERS/////////////
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    } 
/////////////SETTERS/////////////
    
     public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
/////////////MÉTODOS FUNCIONALES/////////////
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el primer número");
        this.numero1 = leer.nextInt();
        System.out.println("Ingresar el segundo número");
        this.numero2 = leer.nextInt();
    }

    public double sumar() {
        double suma = this.numero1 + this.numero2;
        return suma;
    }

    public double restar() {
        double resta = this.numero1 - this.numero2;
        return resta;
    }

    /*Si los armo como funciones que devuelvan un valor no puedo incluir
    los cálculos dentro de condicionales
    Para poder dar los mensajes */
    public void multiplicar() {
        if (numero1 == 0 && numero2 == 0) {
            System.out.println("Uno de los factores es igual a cero.");
            System.out.println("Por lo tanto el producto será cero.");
        } else {
            double producto = this.numero1 * this.numero2;
            System.out.println("El producto es = " + producto);
        }
    }

    public void dividir() {
        if (numero2 == 0) {
            System.out.println("No se puede realizar la división por cero.");
        } else {
            double cociente = this.numero1 / this.numero2;
            System.out.println("El producto es = " + cociente);
        }
    }
    
/////////////TO STRING/////////////

   

    

   
   

    
}
