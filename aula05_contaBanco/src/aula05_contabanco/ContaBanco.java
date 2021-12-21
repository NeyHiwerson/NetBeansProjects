/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_contabanco;

import java.util.Scanner;

/**
 *
 * @author hiw-f
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;    
    private Boolean status;
    
    public ContaBanco(String tipo, String dono, int numConta) {
        this.tipo = tipo;       
        this.dono = dono;
        this.numConta = numConta;
        this.saldo = 0.0f;
        this.status = false;
        
    }
    
    /* public ContaBanco() {
        this.saldo=0;
        this.status=false;  // OU
        // this.setSaldo(0);
        // this.setStatus(false);
        
    }
    */
    public void abrir(){
        if (this.tipo .equals("CP")) {
            depositar();
            this.saldo+=150.0f;// bonus para abertura de Conta Poupança
            this.status=true;
        } else {
            if (this.tipo .equals("CC")) {
                depositar();
                this.saldo+=50.0f;// bonus para abertura de Conta Corrente
                this.status=true;
                
            } else {
                System.out.println("Tipo de conta inválido!");
            }
        }
        
        
    }
    public void fechar(){
        if (this.saldo < 0) {
            System.out.println("Regularize seus débitos com o Banco");
            System.out.println("Débitos no valor de R$" + this.saldo + "reais.");
        } else {
            if (this.saldo > 0) {
                System.out.println("Saque o valor de R$" + this.saldo + "que esta na conta.");
            } else {
                System.out.println("Conta fechada com Sucesso");
                this.status = false;
            }
        }
        
    }
    
    public void depositar(){
        System.out.println("Qual valor do seu depósito?");
        Scanner dep = new Scanner(System.in);
        float valor = dep.nextFloat();
        this.saldo+=valor;
        System.out.println("Depósito realizado com Sucesso.");
        
        
    }
    public void sacar(){
        System.out.println("Qual é o valor do saque?");
        Scanner saq = new Scanner(System.in);
        float valor = saq.nextFloat();
        if (valor>this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {        
            this.saldo-=valor;
            System.out.println("Saque realizado com Sucesso.");
        }
    }
    
    public void status(){
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Numero da conta " + this.getNumConta());
        System.out.println("Saldo R$" + this.getSaldo());
        System.out.println("Status: " + this.status);
    }
    
    public void pagarMensal(){
        if (this.tipo .equals("CP")) {
            this.saldo-=20.0f;
        } else {
            this.saldo-=12.0f;
        }
        
    }

   
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {        
        this.numConta = numConta ;
    }

    
    
    
        
    
}
