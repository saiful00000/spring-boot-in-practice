package com.shaiful.demo.models;


public class Employee {
    String name;
    String designation;
    int salary;
    String level;
    double height;

    public Employee(String name, String designation, int salary, String level, double height) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.level = level;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public String getLevel() {
        return level;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
