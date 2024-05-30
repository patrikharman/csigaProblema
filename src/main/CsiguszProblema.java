
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Csigusz;

public class CsiguszProblema {

    
    public static void main(String[] args) {
        
        try {
            Csigusz cs1 = new Csigusz("cs-1");
            feladat(cs1);
            
            Csigusz cs2 = new Csigusz("cs-2",Csigusz.Szinek.ZOLD);
            feladat(cs2);
            
//            Csigusz cs3 = new Csigusz("cs-3","kék");
//            feladat(cs3);
            
            Csigusz cs4 = new Csigusz("cs-4",Csigusz.Szinek.PIROS);
            feladat(cs4);
            
//            Csigusz cs5 = new Csigusz("cs-5","kék");
//            feladat(cs5);
//            
//            Csigusz cs6 = new Csigusz("cs-3","RókaRudi");
//            feladat(cs6);
            
        } catch (Exception ex) {
            //Logger.getLogger(CsiguszProblema.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Egy csigusz nem jött létre!");
            System.out.println("A hiba oka: "+ex.getMessage());
        }
    }

    private static void feladat(Csigusz cs1) {
        System.out.println(cs1.toString());
        char elso = cs1.getSzin().charAt(0);
        System.out.println("A szín első betűje:" + elso);
    }
    
}
