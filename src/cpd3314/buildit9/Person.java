/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd3314.buildit9;

/**
 *
 * @author c0587637
 */
public class Person {
    private static int numPeople = 0;
    private String name = "";
    private int id = 0;

    public Person() {
        numPeople++;
    }
    
    public Person(Person p) {
        name = p.getName();
        id = p.getId();
        numPeople++;
    }

    public static int getNumPeople() {
        return numPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "{ \"name\" : \"" + name + "\" }";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return (p.getName().equals(name));
        }
        else return false;
    }
    
}
