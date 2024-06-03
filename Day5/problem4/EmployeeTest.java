package com.ey.problem4;


public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeValidator ev = new EmployeeValidator();
        Employee e1 = new Employee(1, "Tony", "Stark");
        Employee e2 = new Employee(2, "Varun", "Stark");
        Employee e3 = new Employee(3, "Amy", "Stark");
        Employee e4 = new Employee(4, "Elon", "Stark");
        Employee e5 = new Employee(5, "Bill", "Stark");
        ev.addEmployee(e1);
        ev.addEmployee(e2);
        ev.addEmployee(e3);
        ev.addEmployee(e4);
        ev.addEmployee(e5);

        ev.list();

        ev.firstNameSort();
    }
}

