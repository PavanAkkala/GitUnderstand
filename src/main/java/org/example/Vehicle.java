package org.example;

public class Vehicle {
    // Parent class

        void start() {
            System.out.println("Vehicle is starting.");
        }
    }

    // Child class inheriting from Vehicle
    class Carr extends Vehicle {
        void honk() {
            System.out.println("Car is honking.");
        }
    }




