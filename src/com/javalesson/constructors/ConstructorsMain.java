package com.javalesson.constructors;

import com.javalesson.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee1 = new Employee("Alex", "Consultant", 100);
        Employee employee2 = new Employee("John", "Enterpreneur", 120);
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
