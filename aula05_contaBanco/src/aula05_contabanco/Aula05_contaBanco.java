/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_contabanco;

/**
 *
 * @author hiw-f
 */
public class Aula05_contaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*    ContaBanco cp01 = new ContaBanco("CP","Jubileu",01);
        
        cp01.status();
        
        cp01.abrir();
        
        cp01.status();
    */    
        ContaBanco cc01 = new ContaBanco("CC","Creusa",01);
        
    //    cc01.status();
        
        cc01.abrir();
        
        cc01.status();
        
        cc01.sacar();
        
    //    cc01.status();
    
        cc01.pagarMensal();
        
    //    cc01.status();
    
        float saldo = cc01.getSaldo();
        System.out.println("Saldo Atual R$" + saldo);
        cc01.fechar();
    }
    
}
