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
public class Hamster extends Pet {
    private double weight;

    public Hamster(double weight, String id, String name, String HairColor) {
        super(id, name, HairColor);
        this.weight = weight;
    this.setEsperro(false);
        this.setEshamster(true);
        this.setEsgato(false);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

   

    @Override
    public String sound() {
       return "";
    }
}
