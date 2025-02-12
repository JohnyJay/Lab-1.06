package com.ironhack.labs.lab_106;

public class Main {
    public static void main(String[] args) {


        // TESTING CORRECT USE OF SALARY LIMIT FOR CLASS INTERN
        Intern persona1 = new Intern("John","johny@email.com",25,18000);
        Intern persona2 = new Intern("Olivia","olivia@email.com",24,25000);

        System.out.println("Intern "+persona1.getName()+" has a salary of "+persona1.getSalary());
        System.out.println("Intern "+persona2.getName()+" has a salary of "+persona2.getSalary());
    }
}
