package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterFaceApp {
    public static void main(String[] args) {

        //* Create the list to store each Person
        List<Person> myFamily = new ArrayList<Person>();

        //* Add each person to the list ...
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Austin", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        //? Sort the list using the compareTo method implemented in the person class
        Collections.sort(myFamily);

        //! loop through the sorted list and display each person
        for(Person thePerson : myFamily) {
            System.out.println(thePerson.toString());


        }

    }

}
