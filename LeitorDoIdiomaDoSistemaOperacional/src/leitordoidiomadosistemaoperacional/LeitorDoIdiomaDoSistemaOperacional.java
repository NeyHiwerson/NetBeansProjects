/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitordoidiomadosistemaoperacional;

import java.util.Locale;

/**
 *
 * @author hiw-f
 */
public class LeitorDoIdiomaDoSistemaOperacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale loc;
        loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        System.out.println("Seu sistema operacional esta em " + idioma + "." );
    }
    
}
