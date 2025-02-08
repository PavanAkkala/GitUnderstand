package org.example;

public class MultiDog {

        public static void main(String[] args) {
            Dogg myDog = new Dogg();
            myDog.eat();  // Inherited from Animal
            myDog.walk(); // Inherited from Mammal
            myDog.bark(); // Defined in Dog
        }
    }
