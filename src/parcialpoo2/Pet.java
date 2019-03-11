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
public abstract class Pet {
    private String id;
    private String name;
    private String HairColor;
    private boolean esperro;
    private boolean esgato;
    private boolean eshamster;
    public abstract String sound();

    public Pet(String id, String name, String HairColor) {
        this.id = id;
        this.name = name;
        this.HairColor = HairColor;
    }

    public boolean isEsperro() {
        return esperro;
    }

    public void setEsperro(boolean esperro) {
        this.esperro = esperro;
    }

    public boolean isEsgato() {
        return esgato;
    }

    public void setEsgato(boolean esgato) {
        this.esgato = esgato;
    }

    public boolean isEshamster() {
        return eshamster;
    }

    public void setEshamster(boolean eshamster) {
        this.eshamster = eshamster;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return HairColor;
    }

    public void setHairColor(String HairColor) {
        this.HairColor = HairColor;
    }
    
}
