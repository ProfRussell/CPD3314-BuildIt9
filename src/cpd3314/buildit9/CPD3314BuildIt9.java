/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd3314.buildit9;

import java.util.Scanner;

/**
 *
 * @author c0587637
 */
public class CPD3314BuildIt9 {

    enum Colours {

        RED, GREEN, BLUE
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Person.getNumPeople());
        Person bob = new Person();
        bob.setName("Bob");
        Person bob2 = new Person(bob);
        bob.setName("Robert");
        System.out.println(bob);
        System.out.println(bob2);
        System.out.println(bob.equals(bob2));

        Home h1 = new Home(bob);
        Home h2 = new Home(h1);
        Person homeOwner = h1.getHomeowner();
        homeOwner.setName("Sue");
        h1.setHomeowner(homeOwner);
        System.out.println(h1.getHomeowner().getName());
        System.out.println(h2.getHomeowner().getName());

        System.out.println(Student.getNumStudents());
        Student steve = new Student();
        steve.setName("Steve");
        Student shaun = new Student();
        shaun.setName("Shaun");
        System.out.println(Student.getNumStudents());

        System.out.println(steve.hashCode());
        System.out.println(shaun.hashCode());
        System.out.println(steve.toString());
        System.out.println(steve.getClass());
        
        Colours choice = Colours.GREEN;
        System.out.println("Pick a Colour:");
        Scanner kb = new Scanner(System.in);
        String input = kb.next().toUpperCase();
        choice = Colours.valueOf(input);
        System.out.println(choice);
    }

}
