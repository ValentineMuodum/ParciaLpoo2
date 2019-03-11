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
public class Vet {
    HashMap<String,Pet>mascotas;

    public Vet() {
        this.mascotas = new HashMap<>();
    }
    public void removePet(Pet a){
        this.mascotas.remove(a.getId());
    }
public void showPetsByType(String type){
    switch(type){
        case "Dog":
            for(Pet a:this.mascotas.values()){
                
                if (a.isEsperro()==true){
                   Dog y;
                    y = (Dog)a;
                    System.out.println("Nombre : "+a.getName());
                    System.out.println("Id : "+a.getId());
                    System.out.println("Color de pelo: "+a.getHairColor());
                    System.out.println("Raza"+y.getBreed());
                }
            
            }break;
            case "Cat":
            for(Pet a:this.mascotas.values()){
                if (a.isEsgato()==true){
                    Cat y;
                    y = (Cat)a;
                    System.out.println("Nombre : "+a.getName());
                    System.out.println("Id : "+a.getId());
                    System.out.println("Color de pelo: "+a.getHairColor());
                   System.out.println("Es cazador "+y.isIsHunter());
                }
            
            }break;
    case "Hamster":
            for(Pet a:this.mascotas.values()){
                if (a.isEshamster()==true){
                     Hamster y;
                    y = (Hamster)a;
                    System.out.println("Nombre : "+a.getName());
                    System.out.println("Id : "+a.getId());
                    System.out.println("Color de pelo: "+a.getHairColor());
                    System.out.println("Peso "+y.getWeight());
                }
            
            }break;}
}
    public HashMap<String, Pet> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashMap<String, Pet> mascotas) {
        this.mascotas = mascotas;
    }
}
