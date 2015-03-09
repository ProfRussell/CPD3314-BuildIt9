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
