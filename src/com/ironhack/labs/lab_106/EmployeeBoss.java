package com.ironhack.labs.lab_106;

public class EmployeeBoss extends Employee{
    public final boolean IS_BOSS = true;

    public EmployeeBoss(String name, String email, int age, double salary) {
        super(name, email, age, salary);
    }
}
