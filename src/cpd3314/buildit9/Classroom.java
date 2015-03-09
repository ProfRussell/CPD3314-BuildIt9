/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd3314.buildit9;

import java.util.Arrays;

/**
 *
 * @author c0587637 Len Payne <len.payne@lambtoncollege.ca>
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
