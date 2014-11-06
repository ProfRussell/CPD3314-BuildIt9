/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd3314.buildit9;

import java.util.Objects;

/**
 *
 * @author c0587637
 */
public class Student {
    private static int numStudents = 0;
    private String name;

    public Student() {
        numStudents++;
    }
    
    public Student(Student s) {
        this();
        name = s.getName();    
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ \"name\" : \"" + name + "\" }";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return (s.getName().equals(name));
        }
        else return false;
    }
    
}
