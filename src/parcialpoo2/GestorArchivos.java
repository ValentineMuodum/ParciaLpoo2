/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author vmuodum
 */
public class GestorArchivos {
    private PrintStream a;
    private File f;
    private Scanner sc;

    public GestorArchivos(File f) throws FileNotFoundException {
        this.f = f;
        a=new PrintStream(f);
        s=new Scanner (f);
    }
 public void leer(Starter s){
     if(s.getPersonas().containsKey(sc.nextLine())==false){
         s.getPersonas().put(key, value)//compoara y asigna el nombre
     }
 }   
}
