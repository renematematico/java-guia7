/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Puntos {
    ////////////////ATRIBUTOS
    public double x1;
    public double y1;
    public double x2;
    public double y2;

        ////////////////CONSTRUCTOR
    public Puntos() {
    }
    
    
    
    ////////////////MÉTODOS FUNCIONALES
    public void crearPuntos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Ingresar coordenada en x para el P1");
        x1=leer.nextDouble();
        System.out.println("Ingresar coordenada en y para el P1");
        y1=leer.nextDouble();
        System.out.println("==================================");
        System.out.println("Ingresar coordenada en x para el P2");
        x2=leer.nextDouble();
        System.out.println("Ingresar coordenada en y para el P2");
        y2=leer.nextDouble();
        System.out.println("==================================");
    
    }
    
    public void distanciaPuntos(){
    
        double distancia= (double) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    
        System.out.println("La distancia entre los puntos es "+distancia+" centímetros");
    
    }
    
    
}

