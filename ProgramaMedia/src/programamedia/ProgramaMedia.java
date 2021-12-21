/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author hiw-f
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner toco = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = toco.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = toco.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("A média foi "+ m);
        if ( m > 9) {
            System.out.println("Parabens pequeno gafanhoto!");
           }
        System.out.println("Digite seu ano de nascimento: ");
        int nasc = toco.nextInt();
        int i = 2021 - nasc;
        System.out.println("Sua idade é "+ i +" anos.");
        if(i>=18) {
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você ainda é de menor.");
        }
            
          
    }
    
}
