package de.telran.data;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 110)
            this.age = age;
        else
            System.out.println("wrong age");
    }

    /* @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Person person = (Person) o;
         return age == person.age &&
                 name.equals(person.name);
     }

     @Override
     public int hashCode() {
       return 0;
 }
         */
    @Override
    public String toString() {
        return "Name: " + name +
                ", age: " + age;
    }

    public static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        return max;
    }

    public static Person getOldestPerson(Person[] persons) {
        Person oldestPerson = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].age > oldestPerson.age)
                oldestPerson = persons[i];
        }
        return oldestPerson;

    }

    public static void displayOldestPerson(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);


        }

    }

    private static int comparePersonByAge(Person p1, Person p2) {
        if (p1.age > p2.age)
            return 1;
        else if (p1.age < p2.age)
            return -1;
        return 0;
    }

    private int compareToPersonByAge(Person person) {
        if (this.age > person.age)
            return 1;
        else if (this.age < person.age)
            return -1;
        return 0;
    }

    public static void sortPersonByAge(Person[] persons) {  //look at comparePersonByAge
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (comparePersonByAge(persons[j], persons[j + 1]) < 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static void sortPersonByAge2(Person[] persons) { //look at compareToPersonByAge
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].compareToPersonByAge(persons[j + 1]) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;

                }

            }
        }
    }

    public static void sortPersonByName(Person[] group) {
        for (int i = 0; i < group.length - 1; i++) {
            for (int j = 0; j < (group.length - 1) - i; j++) {
                if (group[j].name.compareTo(group[j + 1].name) > 0) {
                    Person temp = group[j + 1];
                    group[j + 1] = group[j];
                    group[j] = temp;
                }
            }
        }
    }
}
