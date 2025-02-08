package org.example;

public class SingleVehicle {

    public static void main(String[] args) {
        Carr myCar = new Carr();
        myCar.start(); // Inherited method from Vehicle
        myCar.honk();  // Method from Car class
    }
}
