/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Circunferencia {
    ///////// ATRIBUTOS /////////
    private double radio;

    //////////////// CONSTRUCTOR //////////////
//CONSTRUCTOR sin parámetros
    public Circunferencia() {
    }
        
//CONSTRUCTOR con parámetros
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    ////////// GETTERS ///////////
    public double getRadio() {
        return radio;
    }
///////////// SETTERS /////////////
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
/////////////MÉTODOS FUNCIONALES/////////////
    public void crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
    this.radio=leer.nextDouble();
    }
    
    public double areaCirc(){
    double area=(double)(Math.PI)*(double)(Math.pow(radio,2));        
        return area;
    }
    
    public double perimCirc(){
    double perim=(double)(Math.PI)*radio*2;        
        return perim;    
    }
    
    //////////////////// TO STRING ///////////////////

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
    
}



