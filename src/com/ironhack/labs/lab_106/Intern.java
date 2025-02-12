package com.ironhack.labs.lab_106;

public class Intern extends Employee{
    private final double SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        this.setSalary(salary);
    }

    public void setSalary(double salary){
        if(salary>SALARY_LIMIT) this.salary = SALARY_LIMIT;
        else this.salary = salary;
    }
}
