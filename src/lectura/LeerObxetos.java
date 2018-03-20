/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import persoas.Alumno;

/**
 *
 * @author estudios
 */
public class LeerObxetos {
        Scanner sc;
    String[] lista = new String[2];
    Alumno alum;
    String linea = null;
private int aprobados;
    public void leerObxetos(){
        
        Alumno a1;
        File fich;
        String[]lista;
        try {
            sc=new Scanner(new File("C:\\Users\\estudios\\Desktop\\alumno.txt"));
            while(sc.hasNextLine()){
                linea=sc.nextLine();
                lista = new String[2];
                lista=linea.split(",");
                a1= new Alumno(lista[0],Integer.parseInt(lista[1]));
                System.out.println(a1);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro1"+ex.getMessage());
        }sc.close();
    }
    public ArrayList suspensos(ArrayList<Alumno> aAlumno){
            try {

            sc = new Scanner(new File("alumnos.txt"));
            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                //lista = new String[2];
                lista = linea.split(",");
                alum = new Alumno(lista[0], Integer.parseInt(lista[1]));

                //if(Integer.parseInt(linea)){
                //aAlumno.add(alum = new Alumno(lista[0], Integer.parseInt(lista[1])));
                //}
                
                if (alum.getNota() < 5) {
                    aAlumno.add(alum);
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }
        sc.close();

        return aAlumno;
}
       
       
    }
    

