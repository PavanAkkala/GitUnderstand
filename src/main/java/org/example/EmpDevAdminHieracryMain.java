package org.example;

public class EmpDevAdminHieracryMain {

    public static void main(String[] args) {

        Developer developer = new Developer(101,"Reddy",25.0,"Java");
        Admin admin = new Admin(102,"Naidu",1400.2,"one");
        developer.developerDetails();
        admin.adminDetails();

    }
}
