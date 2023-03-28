/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.entidades.Usuario;



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
    
    //Creamos el objeto "m1" que pertenece a la clase Mascota
    Mascota m1= new Mascota();
      //Le agrego los atributos al objeto m1
    m1.apodo="Chiquito";
    m1.nombre="Fernando Chiquito";
    m1.tipo="Perro";
    m1.edad=14;
    m1.raza="Beagle";
    m1.cola=true;
    m1.color="Tricolor";
    
    //Creamos el objeto "m2" que pertenece a la clase Mascota
    Mascota m2= new Mascota();
    m2.apodo="Chori";
    m2.nombre="Chorizo Bombóm";
        System.out.println("Ingresar el tipo de mascota de 'm2'");
    m2.tipo=leer.next();
    m2.edad=10;
    m2.raza="Beagle";
    m2.cola=true;
    m2.color="Bicolor";
    
    //Creamos una nueva mascota m3 utilizando constructor
    System.out.println("Ingresar el apodo de mascota de 'm3'");
    Mascota m3 = new Mascota("Tobias Goldstein", leer.next(), "Perro");
    
    Usuario us1=new Usuario("Cristian", "Escobar", 29123855,"Argentina");
    
        System.out.println("Ingresar el nombre para cambiar al us1");

/*Se puede enviar un nombre para cambiar el valor del atributo
    mediante un set y dentro un leer*/
us1.setNombre(leer.next());

System.out.println(m1.toString());
System.out.println(m2.toString());
System.out.println(m3.toString());

m1.pasear(150);
m2.pasear(250,2);
m3.pasear(110,3);
    
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());


System.out.println("===========================");
System.out.println(us1.toString());


    }
    
}
