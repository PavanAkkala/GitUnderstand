package org.example;

public class AnimalDog {

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        Dog myDog1 = new Dog("seeu","meenu");
        myDog1.display();
        myDog.display();

        Animal animal = new Animal("Donkey");
        animal.display();
    }
}
