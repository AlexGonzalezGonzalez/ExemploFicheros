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
public class LerFicheiro {
        
        Scanner scc;
    public void lerLinhas(){
       // File fich=new File("C:\\Users\\estudios\\Desktop\\Primeiro.txt");
        File fich2= new File("segundo.txt");
            try {
                scc=new Scanner(fich2);
                while(scc.hasNextLine()){
                    System.out.println(scc.nextLine());
                }
            } catch (FileNotFoundException ex) {
                System.out.println("erro1"+ex.getMessage());
            }
            scc.close();
}
}
