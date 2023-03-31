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
public class Cuenta {

/////////////ATRIBUTOS/////////////
    public double saldo;
    public String titular;

/////////////CONSTRUCTORES/////////////
    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

/////////////GETTERS/////////////
/////////////SETTERS/////////////
/////////////MÉTODOS FUNCIONALES/////////////
    public void retirarDinero() {
        int opc = 0,opc2;
        double transaccion;
        boolean menu=true;
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO");       
        
        do {              
        
        do {
            System.out.println("Indicar si desea realizar");
            System.out.println("(1)-DEPOSITO");
            System.out.println("(2)-RETIRO");
            opc = leer.nextInt();
        } while (opc < 1 || opc > 2);

        if (opc == 1) {
            System.out.println("Indicar el monto a DEPOSITAR");
            transaccion = leer.nextDouble();
            saldo += transaccion;
            System.out.println("=================================");
            System.out.println("El saldo de su cuenta es $"+saldo);
            System.out.println("=================================");
        }
        if (opc == 2) {
            System.out.println("Indicar el monto a RETIRAR");
            transaccion = leer.nextDouble();
            
            while (transaccion>saldo){
            System.out.println("==================");
            System.out.println("SALDO INSUFICIENTE");
            System.out.println("==================");
            System.out.println("Indicar el monto a RETIRAR");
            transaccion = leer.nextDouble();
            }
            
            saldo-=transaccion;         
                            
            System.out.println("=================================");
            System.out.println("El saldo de su cuenta es $"+saldo);
            System.out.println("=================================");
        }
            do {
            System.out.println("¿Desea realizar otra transacción?");
            System.out.println("(1)-SI");
            System.out.println("(2)-NO");
            opc2=leer.nextInt();            
            } while (opc2<1 || opc2>2);
            
            if(opc2==2){
            menu=false;
            }           
        
        } while (menu==true);
        
        System.out.println("======================");
        System.out.println("TRANSACCIÓN FINALIZADA");
        System.out.println("RETIRE SU TARJETA");
        System.out.println("======================");

    }
/////////////TO STRING/////////////
    @Override
    public String toString() {
        return "Cuenta{" + "saldo= $" + saldo + ", titular=" + titular + '}';
    }

}
