/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author crist
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        Mascota m1 = new Mascota("tobias ", "toby", "perro");  
        Mascota m2 = new Mascota("Ricardo", "Richard", "Gato");
       
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo+" "+m1.nombre);

    }

}
