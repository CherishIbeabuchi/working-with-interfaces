package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterFaceApp {
    public static void main(String[] args) {

        //* The arraylis
        List<Person> myFamily = new ArrayList<Person>();

        //* Add ...
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        Collections.sort(myFamily);

        for(Person thePerson : myFamily) {
            System.out.println(thePerson.toString());


        }

    }

}
