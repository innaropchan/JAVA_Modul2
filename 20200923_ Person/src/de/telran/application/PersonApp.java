package de.telran.application;

import de.telran.data.Person;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 25);
        person1.setName("Vasiliy");
        Person person2 = new Person("Alex", 21);
        Person person3 = new Person("Katya", 26);
        Person person4 = new Person("Masha", 19);

        Person person5 = new Person("Alex", 15);



        Person[] group = {person1, person2, person3, person4, person5};

        //Person.displayPersons(group);
       /* System.out.println("------------");
        Person.sortPersonByAge(group);
        Person.displayPersons(group);
        System.out.println("------------");
        Person.sortPersonByAge2(group);
        Person.displayPersons(group);*/

        String str1 = "Kolya";
        String str2 = "Vasya";

        System.out.println(str1.compareTo(str2));

        Person.sortPersonByName(group);
        Person.displayPersons(group);
       // Person.displayOldestPerson(group);
      //  System.out.println("Oldest person is " +  Person.getOldestPerson(group));

        //System.out.println(Arrays.toString(group));
    }
}
