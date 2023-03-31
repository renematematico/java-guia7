/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosas;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Juego {
    
    ///////////ATRIBUTO
    public int num1;
    public int intentos1;
    public int num2;
    public int intentos2;
    public int intentos;
    
    ///////////CONSTRUCTORES
    public Juego() {
    }  
    
    
    ///////////MÉTODOS FUNCIONALES

  public void iniciarJuego(){
      //VARIABLES
      Scanner leer = new Scanner(System.in);
      int num=0;

      System.out.println("INGRESAR la cantidad de intentos disponibles");
      intentos = leer.nextInt();
      System.out.println("JUGADOR 1 - Ingrese su número a adivinar");
      num1 = leer.nextInt();

      System.out.println("JUGADOR 2 - Intente adivinar el número del JUGADOR 1");
      for (int i = 0; i < intentos; i++) {
          num = leer.nextInt();
          if (num1 == num) {
              System.out.println("¡¡¡CORRECTO!!!");
              System.out.println("¡¡¡HAS GANADO!!!");
              intentos2 += 1;
              break;
          }
          if (num < num1) {
              System.out.println("El número secreto es MAYOR");
              System.out.println("Ingresá un nuevo número");
          }
          if (num > num1) {
              System.out.println("El número secreto es MENOR");
              System.out.println("Ingresá un nuevo número");
          }
          intentos2 += 1;
      }
      if(num1!=num && intentos==intentos2){
          System.out.println("Se terminaron los intentos. PERDISTE");
      }
System.out.println("==========================================");
  System.out.println("JUGADOR 2 - Ingrese su número a adivinar");
      num2 = leer.nextInt();

      System.out.println("JUGADOR 1 - Intente adivinar el número del JUGADOR 2");
      for (int i = 0; i < intentos; i++) {
          num = leer.nextInt();
          if (num2 == num) {
              System.out.println("¡¡¡CORRECTO!!!");
              System.out.println("¡¡¡HAS GANADO!!!");
              intentos1 += 1;
              break;
          }
          if (num < num2) {
              System.out.println("El número secreto es MAYOR");
              System.out.println("Ingresá un nuevo número");
          }
          if (num > num2) {
              System.out.println("El número secreto es MENOR");
              System.out.println("Ingresá un nuevo número");
          }
          intentos1 += 1;
      }
      if(num2!=num && intentos==intentos1){
          System.out.println("Se terminaron los intentos. PERDISTE");
      }
  
      System.out.println("Los INTENTOS JUGADOR 1 ="+intentos1);
      System.out.println("Los INTENTOS JUGADOR 2 ="+intentos2);
      
      if(intentos1>intentos2){
          System.out.println("El ganador de esta vuelta es el JUGADOR 2");
      }
      if(intentos1<intentos2){
          System.out.println("El ganador de esta vuelta es el JUGADOR 1");
      }
      if(intentos1==intentos2){
          System.out.println("En esta vuelta tuvimos un EMPATE.");
      }
  
  }
    
    
}

