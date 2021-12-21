/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author hiw-f
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        float cota = (float) 9.2;
        float topa = new Float(9.7);       
        System.out.println("A nota é: ");
        System.out.println(nota);
        System.out.println(cota);
        System.out.println(topa);
        System.out.format("A nota de %s é %.2f \n", nome, nota);
    }
    
}
