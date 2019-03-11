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
public class Person {
    private String name;
    private String id;
    private HashMap<String,Pet>mascotas;

    public Person(String name, String id) {
        this.mascotas = new HashMap<>();
        this.name = name;
        this.id = id;
    }
    public void showsPets(){
        
    }
}
