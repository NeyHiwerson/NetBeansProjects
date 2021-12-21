/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartoprograma;


import matematica.Matematica;
import static matematica.Matematica.soma;

/**
 *
 * @author hiw-f
 */
public class QuartoPrograma {
    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        int resultado;
        resultado = soma(5,7);
        System.out.println("O resultado da soma: "+ resultado);
       
        
    }


}
