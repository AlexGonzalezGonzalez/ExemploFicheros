/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudios
 */
public class LerPalabras {
    Scanner sc;
    public void lerPalabras(){
       File fich = new File("C:\\Users\\estudios\\Desktop\\Primeiro.txt");
        try {
            sc = new Scanner (fich).useDelimiter("\\s*,\\s*");
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LerPalabras.class.getName()).log(Level.SEVERE, null, ex);
        }sc.close();
    }
}
