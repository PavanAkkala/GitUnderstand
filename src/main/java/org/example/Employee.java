package org.example;

public class Employee {

    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public void employeeDetails() {

        System.out.println("id id "+id);
        System.out.println("name is "+name);
        System.out.println("salary is "+salary);

    }
}

