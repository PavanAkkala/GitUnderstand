package org.example;

public class Dog extends Animal {

    private String breed;

    // Subclass constructor
    public Dog(String name, String breed) {
        // Call to superclass constructor
        super(name);
        this.breed = breed;
    }

    @Override
    public void display() {
        //display();
        super.display();
        System.out.println("Dog breed: " + breed);
    }
}
