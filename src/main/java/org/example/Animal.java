package org.example;

public class Animal {

        private String name;

        // Superclass constructor
        public Animal(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Animal name: " + name);
        }
    }
