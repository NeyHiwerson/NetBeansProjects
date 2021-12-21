/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contapernas;

import java.util.Scanner;

/**
 *
 * @author hiw-f
 */
public class ContaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite quantas pernas tem o ser vivo: ");
        int pernas = leia.nextInt();
        String tipo;
        switch (pernas){
            case 1 :
                tipo = "Saci";
                break;
            case 2 :
                tipo = "Bípede";
                break;
            case 4 :
                tipo = "Quadrúpede";
                break;
            case 6 :
                tipo = "Aranha";
                break;
            default :
                tipo = "ET";  
                
        }
        System.out.println("O ser vivo é um "+ tipo +".");
    }
    
}
