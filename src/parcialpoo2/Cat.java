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
public class Cat extends Pet{
    private boolean isHunter;

    public Cat(boolean isHunter, String id, String name, String HairColor) {
        super(id, name, HairColor);
        this.isHunter = isHunter;
        this.setEsperro(false);
        this.setEshamster(false);
        this.setEsgato(true);
    }

    public boolean isIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    @Override
    public String sound() {
        return "Miau";
    }   
}
