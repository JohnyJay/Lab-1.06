package com.ironhack.labs.lab_106;

public class InternWithBoss extends Intern{
    private EmployeeBoss boss;
    public InternWithBoss(String name, String email, int age, double salary, EmployeeBoss boss) {
        super(name, email, age, salary);
        this.boss = boss;
    }

    public EmployeeBoss getBoss() {
        return boss;
    }

    public void setBoss(EmployeeBoss boss) {
        this.boss = boss;
    }
}
