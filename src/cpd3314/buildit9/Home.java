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
public class Home {
    private Person homeowner;

    public Home() {
    }
    
    public Home(Person homeowner) {
        this.homeowner = homeowner;
    }
    
    public Home(Home h) {
        homeowner = new Person(h.getHomeowner());
    }

    public Person getHomeowner() {
        return new Person(homeowner);
    }

    public void setHomeowner(Person homeowner) {
        this.homeowner = homeowner;
    }
    
}
