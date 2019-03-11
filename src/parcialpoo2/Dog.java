/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

/**
 *
 * @author vmuodum
 */
public class Dog extends Pet{
    private String Breed;

    public Dog(String Breed, String id, String name, String HairColor) {
        super(id, name, HairColor);
        this.Breed = Breed;
        this.setEsperro(true);
        this.setEshamster(false);
        this.setEsgato(false);
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    @Override
    public String sound() {
        return "Guau";
    }
}
