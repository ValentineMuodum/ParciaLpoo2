/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import java.util.HashMap;

/**
 *
 * @author vmuodum
 */
public class Starter {
private HashMap<String,Person>personas=new HashMap<>();
private Vet v;
    public void readPets(Vet v){
    //en Pet esta este metodo
}
public void manageVet(Vet v,String action){
    //en pet esta el metodo remove
}

    public HashMap<String, Person> getPersonas() {
        return personas;
    }

    public void setPersonas(HashMap<String, Person> personas) {
        this.personas = personas;
    }

    public Vet getV() {
        return v;
    }

    public void setV(Vet v) {
        this.v = v;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
  
}
