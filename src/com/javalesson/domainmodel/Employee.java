package com.javalesson.domainmodel;

public class Employee {

    private static int id;

    static {
        id = 1000;
        System.out.println("Static init");
    }

    private int employeeid;
    private String name;
    private String job;
    private int salary;
    private String departament;

    {
        departament = "IT";
        System.out.println("Nonstatic init");
    }

    private Employee(String name, String job, int salary, String departament) {
        employeeid = id++;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.departament = departament;
        System.out.println("Constructor with 4 params called");
        //System.out.println(toString());
    }

    public Employee(String name, String job, int salary) {
        this(name, job, salary, "IT dept");
        System.out.println("Constructor with 3 params called");
    }

    public Employee() {
        this("A", "B", 1);

        System.out.println("Empty constructor called");

    }

    public static int getId() {
        return id;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}