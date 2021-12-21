/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("tric",0.7f,"preta");               
        c1.status();
        System.out.println("A caneta " + c1.getModelo() + " tem ponta " + c1.getPonta());
        
        Caneta c2 = new Caneta("Bica",0.3f,"Amarela");
        c2.status();
        System.out.println("A caneta " + c2.getModelo() + " tem ponta " + c2.getPonta());

        Caneta c3 = new Caneta("Compaq",0.5f,"vermelha");
        c3.status();
        System.out.println("A caneta " + c3.getModelo() + " tem ponta" + c3.getPonta());

    }
    
}
