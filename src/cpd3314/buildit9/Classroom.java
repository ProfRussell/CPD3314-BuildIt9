/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd3314.buildit9;

import java.util.Arrays;

/**
 *
 * @author c0587637
 */
public class Classroom {

    protected Student[] students = {};

    public Classroom() {

    }

    public Classroom(Classroom c) {
        students = c.students.clone();
    }

    public Student getStudent(int i) {
        return students[i];
    }

    public void addStudent(Student s) {
        Student[] newStudents = new Student[students.length + 1];
        int i;
        for (i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[i] = s;
        students = newStudents;
        // Short Way
        // students = Arrays.copyOf(students, students.length + 1);
        // students[students.length - 1] = s;        
    }
}
