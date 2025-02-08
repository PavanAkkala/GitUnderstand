package org.example;

public class Car { // Instance variables
        private String color;
        private String model;

        // Constructor
        public Car(String color, String model) {
            this.color = color;
            this.model = model;
        }

        // Instance method
        public void displayInfo() {
            System.out.println("Car model: " + model + ", Color: " + color);
        }
    }

