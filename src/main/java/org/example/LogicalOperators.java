package org.example;


public class LogicalOperators {

    public static void main(String[] args) {

        int a = 20;
        int b = 34;
        int c = 45;
        int d = 55;
        System.out.println(a<b && c>d);//false And operator will return True when both becomes true
        System.out.println(a<b || c>d); //True OR operator will return true when one condition becomes true
        System.out.println(!(a<b)); // False
    }


}
