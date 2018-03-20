/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploficheiros;

import escribir.EscribirFichero;
import lectura.LeerNumeros;
import lectura.LeerObxetos;
import lectura.LerFicheiro;
import lectura.LerPalabras;

/**
 *
 * @author estudios
 */
public class ExemploFicheiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      ArrayList<Alumno>suspensos = new ArrayList<Alumno>();
//      LeerFichero leer = new LeerFichero();
//      LeerPalabras pal = new LeerPalabras();
//      LeerNumeros num = new LeerNumeros();
//      LeerObjetos obj = new LeerObjetos();
      EscribirFichero escr = new EscribirFichero();
//      leer.leerLineas();
//      pal.leerPalabras();
//      num.leerNumeros();
//      num.sumaPares();
//      obj.leerObjetos();
//      System.out.println(obj.numeroSuspensos(suspensos));
escr.escribirFrases();
}
