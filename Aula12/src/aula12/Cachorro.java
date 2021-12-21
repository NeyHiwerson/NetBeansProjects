/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author hiw-f
 */
public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Latindo, AU! AU! AU!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo uma raçãozinha");
    }
    
    public void reagir(String frase){
        if((frase.equals("ola"))||(frase.equals("vem"))||(frase.equals("bom dia"))){
            System.out.println("Abanar o rabo e latir");
        }else{
            System.out.println("Rosnar");
        }        
    }
    public void reagir(int hora, int min ){
        if (hora<12) {
            System.out.println("Abanar o rabo");
        } else if (hora>=18){
            System.out.println("Ignorar");        
        } else{
            System.out.println("Abanar o rabo e latir animado");
        }
    }  
    public void reagir(boolean dono){
        if(dono == false){
            System.out.println("Rosnar e Latir");
        } else {
            System.out.println("Abanar o rabo e pular");
        }
    }
    public void reagir(int idade, float peso){
        if(idade<5){
            if(peso<10){
                System.out.println("Abanar o rabo e latir");
            } else {
                System.out.println("Latir");
            }
        }else if(idade>12){
             if(peso<10){
                System.out.println("Abanar o rabo ");
            } else {
                System.out.println("Deitar");
            }
        }else {
            if ((idade>=5)&&(idade<=12)) {
                 if(peso<10){
                System.out.println("Abanar o rabo, correr e latir ");
            } else {
                System.out.println("Abanar o rabo, andar e latir");
            }
            }
            
        }
        
    }

    @Override
    public String toString() {
        return "Cachorro " + "com pelo "+this.getCorPelo()+ ", pesando "+this.getPeso()
                +"kg"+", com idade de "+this.getIdade()+" anos "+".";
    }
 
    
}
