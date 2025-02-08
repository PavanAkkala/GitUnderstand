package org.example;

public class Animal1 {

    // Base class
        void eat() {
            System.out.println("Animal is eating.");
        }
    }

    // Derived class inheriting from Animal
    class Mammal extends Animal1 {
        void walk() {
            System.out.println("Mammal is walking.");
        }
    }

    // Further derived class inheriting from Mammal
    class Dogg extends Mammal {
        void bark() {
            System.out.println("Dog is barking.");
        }
    }



