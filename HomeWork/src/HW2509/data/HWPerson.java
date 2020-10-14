package HW2509.data;

import java.util.Objects;

public class HWPerson {

    public static class Person {
        private String name;
        private int age;
        private int height;

        public Person(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height= height;
        }

        public int getHeight() {
            return height;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            if (age >= 0 && age <= 110) {
                this.age = age;
            } else {
                System.out.println("wrong age");
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    height == person.height &&
                    name.equals(person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, height);
        }

        public String toString() {
            return "Name: " + name +
                    ", age: " + age +
                    ",height: " + height;
        }

        public static void displayPersons(Person[] persons) {
            Person[] var1 = persons;
            int var2 = persons.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                Person p = var1[var3];
                System.out.println(p);
            }

        }

        public static int findMax(int[] numbers) {
            int max = numbers[0];

            for (int i = 0; i < numbers.length; ++i) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            return max;
        }

        public static Person getOldestPerson(Person[] persons) {
            Person oldestPerson = persons[0];

            for (int i = 1; i < persons.length; ++i) {
                if (persons[i].age > oldestPerson.age) {
                    oldestPerson = persons[i];
                }
            }

            return oldestPerson;
        }

        public static void displayOldestPerson(Person[] persons) {
            Person[] var1 = persons;
            int var2 = persons.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                Person p = var1[var3];
                System.out.println(p);
            }

        }

        private static int comparePersonByAge(Person p1, Person p2) {
            if (p1.age > p2.age) {
                return 1;
            } else {
                return p1.age < p2.age ? -1 : 0;
            }
        }

        private int compareToPersonByAge(Person person) {
            if (this.age > person.age) {
                return 1;
            } else {
                return this.age < person.age ? -1 : 0;
            }
        }
        private static int comparePersonByHeight(Person p1, Person p2) {
            if (p1.height > p2.height) {
                return 1;
            } else {
                return p1.height < p2.height ? -1 : 0;
            }
        }
        public static void sortPersonByHeight(Person[] persons) {
            for (int i = 0; i < persons.length - 1; ++i) {
                for (int j = 0; j < persons.length - 1 - i; ++j) {
                    if (comparePersonByHeight(persons[j], persons[j + 1]) < 0) {
                        Person temp = persons[j + 1];
                        persons[j + 1] = persons[j];
                        persons[j] = temp;
                    }
                }
            }

        }

        public static void sortPersonByAge(Person[] persons) {
            for (int i = 0; i < persons.length - 1; ++i) {
                for (int j = 0; j < persons.length - 1 - i; ++j) {
                    if (comparePersonByAge(persons[j], persons[j + 1]) < 0) {
                        Person temp = persons[j + 1];
                        persons[j + 1] = persons[j];
                        persons[j] = temp;
                    }
                }
            }

        }

        public static void sortPersonByAge2(Person[] persons) {
            for (int i = 0; i < persons.length - 1; ++i) {
                for (int j = 0; j < persons.length - 1 - i; ++j) {
                    if (persons[j].compareToPersonByAge(persons[j + 1]) > 0) {
                        Person temp = persons[j + 1];
                        persons[j + 1] = persons[j];
                        persons[j] = temp;
                    }
                }
            }

        }

        public static void sortPersonByName(Person[] group) {
            for (int i = 0; i < group.length - 1; ++i) {
                for (int j = 0; j < group.length - 1 - i; ++j) {
                    if (group[j].name.compareTo(group[j + 1].name) > 0) {
                        Person temp = group[j + 1];
                        group[j + 1] = group[j];
                        group[j] = temp;
                    }
                }
            }

        }
    }
}
