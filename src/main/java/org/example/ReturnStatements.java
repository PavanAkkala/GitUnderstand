package org.example;

public class ReturnStatements {
    public static int add(int a, int b) {

        System.out.println("vlaue a is "+a+" and value b is "+b);
        return a+b;

    }



    public static void main(String[] args) {

        ReturnStatements.add(10,20);
    }

}

