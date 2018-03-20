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
public class LeerNumeros {

    Scanner sc;

    public void lerNumeros() {

        File fich = new File("C:\\Users\\estudios\\Desktop\\tercero.txt");
        try {
            sc = new Scanner(fich).useDelimiter("\\s*,\\s*");
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
                

            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            sc.close();
        }

    }

    public void sumaParesFichero() {
        int suma = 0,num;
        File fich = new File("C:\\Users\\estudios\\Desktop\\tercero.txt");
        try {
            sc = new Scanner(fich).useDelimiter("\\s*,\\s*");
            while (sc.hasNextInt()) {
                num=sc.nextInt();
                
                if (num % 2 == 0) {
                    
                       suma+=num;
                }
                    
            }
                System.out.println(suma);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            sc.close();

        }

    }
}
