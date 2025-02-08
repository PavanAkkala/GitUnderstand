package org.example;

public class WLoop2 {
    public static void main(String[] args) {

        int number = 1;
        int sum = 0;

        while (number <= 5) { // Condition
            sum += number; // Add current number to sum
            //sum = sum+number;
            number++; // Increment
        }

        System.out.println("Sum is: " + sum);
    }

    }
