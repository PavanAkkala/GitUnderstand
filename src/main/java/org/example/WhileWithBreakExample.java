package org.example;

public class WhileWithBreakExample {
        public static void main(String[] args) {
            int number = 1;

            //while(number<6) { or
            while (true) { // Infinite loop
                System.out.println("Number: " + number);

                if (number == 5) { // Exit condition
                    System.out.println("Breaking the loop as number reached 5.");
                    break; // Exit the loop
                }

                number++; // Increment
            }

            System.out.println("Loop has been terminated.");
        }
    }


