package org.example;

public class PreAndPostIncrement {
    public static void main(String[] args) {

        //Post Increment - use first, increment --> 25 is first assigned to c then incremented
        int a = 25;
        int c = a+1; //a++ both are same
        // a= a-5 or a-=5 both are same
        // a= a+6 or a+=6 both are same
        System.out.println("a = "+a);//26
        System.out.println("c = "+c);//25

        //Pre - Increment - increment first, use --> 12 is incremented and assigned to d
        int f = 12;
        int d = ++f;
        System.out.println("f = "+f);//13
        System.out.println("d = "+d);//13

       String browsername = "Don";
       switch (browsername) {
           case "chrome":
               break;
           case "fire":
               break;
       }


    }
}