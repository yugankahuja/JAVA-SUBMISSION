package com.ey.problem4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.getFirstName().compareTo(b.getFirstName());
    }
}

public class EmployeeValidator {
    List<Employee> employeeList = new ArrayList<>();

    public String addEmployee(Employee e) {
        employeeList.add(e);
        return "Employee added successfully";
    }

    public void list() {
        employeeList.forEach(x -> System.out.println(x));
    }

    public void firstNameSort() {
        Collections.sort(employeeList, new FirstNameComparator());
        list();
    }
}
