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

/**
 *
 * @author c0587637 Len Payne <len.payne@lambtoncollege.ca>
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
