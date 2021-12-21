
package usandotelasprontas;

import javax.swing.JOptionPane;

public class UsandoTelasProntas {

    public static void main(String[] args) {
        // TODO code application logic here
        int nD;
        int sT = 0 ;        
        int cont = 0 ;
        int tPar = 0 ;
        int tImp = 0 ;
        int m100 = 0 ;
        int media = 0 ;
        do{
          nD = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero: "));         
          sT += nD; 
          if(nD==0){
              break;
          }
          if(nD>100){
              m100++ ;
          }
          cont++;
          if(nD%2==0){
              tPar++;
          }else{
              tImp++;
          }
          
        }while(nD != 0);
        media = sT / cont ;
        JOptionPane.showMessageDialog(null,"<html>Resultado Final <hr>" + "<br>A soma total é: " + sT +
                "<br>Total de valores: "+(cont)+"<br>Total de Pares: "+tPar+"<br>Total de Ímpares: " 
                + tImp + "<br>Acima de 100: "+ m100 +"<br>Media dos valores: " + media + "</html>");
    }
    
}
