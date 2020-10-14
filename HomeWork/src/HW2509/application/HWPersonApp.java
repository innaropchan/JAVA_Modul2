package HW2509.application;

import HW2509.data.HWPerson;

public class HWPersonApp {
    public HWPersonApp() {
    }

    public static void main(String[] args) {
        HWPerson.Person person1 = new HWPerson.Person("Vasya", 25, 176);
        person1.setName("Vasiliy");
        HWPerson.Person person2 = new HWPerson.Person("Alex", 21, 173);
        HWPerson.Person person3 = new HWPerson.Person("Katya", 26, 160);
        HWPerson.Person person4 = new HWPerson.Person("Masha", 19, 168);
        HWPerson.Person person5 = new HWPerson.Person("Alex", 15,152);
        HWPerson.Person[] group = new HWPerson.Person[]{person1, person2, person3, person4, person5};
        String str1 = "Kolya";
        String str2 = "Vasya";
       // System.out.println(str1.compareTo(str2));
       // HWPerson.Person.sortPersonByName(group);
        //HWPerson.Person.displayPersons(group);
        HWPerson.Person.sortPersonByHeight(group);
        HWPerson.Person.displayPersons(group);
    }
}


