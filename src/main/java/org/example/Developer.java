package org.example;

public class Developer extends Employee {

    String language;

    public Developer(int id,String name,double salary, String language) {

        super(id,name,salary);
        this.language = language;
    }

    public void developerDetails() {

        super.employeeDetails();
        System.out.println("known language is"+language);


    }
}
