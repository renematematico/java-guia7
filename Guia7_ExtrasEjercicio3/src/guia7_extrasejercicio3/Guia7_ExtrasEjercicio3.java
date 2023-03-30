/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extrasejercicio3;

import cosas.Juego;

/**
 *
 * @author crist
 */
public class Guia7_ExtrasEjercicio3 {
    
    /*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
    a dos jugadores jugar un juego de adivinanza de números. El primer jugador 
    elige un número y el segundo jugador intenta adivinarlo. El segundo jugador 
    tiene un número limitado de intentos y recibe una pista de "más alto" o 
    "más bajo" después de cada intento. El juego termina cuando el segundo 
    jugador adivina el número o se queda sin intentos. Registra el número de 
    intentos necesarios para adivinar el número y el número de veces que cada
    jugador ha ganado.*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Juego vuelta1=new Juego();
        
        vuelta1.iniciarJuego();
    }
    
}
