package org.example;

public class Admin extends Employee {

    String tyre;

    public Admin(int id,String name,double salary,String tyre) {

        super(id,name,salary);
        this.tyre = tyre;
    }

    public void adminDetails() {
        super.employeeDetails();
        System.out.println("Type of admin is "+tyre);


    }
}
