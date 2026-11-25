package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    //* Constructor
    public Person( String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //* Getter and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person other) {

        //? Sort By Last Name ...
        int lastName = this.lastName.compareTo((other.getLastName()));

        if (lastName != 0) {
            return lastName;
        }
        //? Sort By First Name ...
        int firstName = this.firstName.compareTo(other.getFirstName());
        if (firstName != 0) {
            return firstName;
        }
        //? Sort by age if first and last names match
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", " + age;
    }
}