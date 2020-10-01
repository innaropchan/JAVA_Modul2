public class Animal {
    void print(){
        System.out.println("I`m a animal");
    }
}

class Dog extends Animal {
    @Override
    void print() {
        System.out.println("I`m a dog");;
    }
}

class AnimalApp {
    void voiceAnimal(Animal animal) {
        System.out.println("animal");
        animal.print();
    }

    void voiceAnimal(Dog dog) {
        System.out.println("dog");
        dog.print();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Dog dog1 = new Dog();

        AnimalApp app= new AnimalApp();

        app.voiceAnimal(animal);
        System.out.println();
        app.voiceAnimal(dog);
        System.out.println();
        app.voiceAnimal(dog1);

    }
}
