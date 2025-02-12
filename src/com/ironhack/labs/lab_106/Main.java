package com.ironhack.labs.lab_106;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        // TESTING CORRECT USE OF SALARY LIMIT FOR CLASS INTERN
        Intern persona1 = new Intern("John","johny@email.com",25,18000);
        Intern persona2 = new Intern("Olivia","olivia@email.com",24,25000);

        System.out.println("Intern "+persona1.getName()+" has a salary of "+persona1.getSalary());
        System.out.println("Intern "+persona2.getName()+" has a salary of "+persona2.getSalary());

        persona1.setSalary(345_000);
        persona2.setSalary(120_000);

        System.out.println("Intern "+persona1.getName()+" has a salary of "+persona1.getSalary());
        System.out.println("Intern "+persona2.getName()+" has a salary of "+persona2.getSalary());

        // CREATE TEN EMPLOYEES
        Employee[] empleados = new Employee[10];

        empleados[0] = new Employee("Juan","juan@example.com",31,28_000);
        empleados[1] = new Employee("Mario","mario@example.com",33,32_000);
        empleados[2] = new Employee("Óscar","oscar@example.com",28,35_000);
        empleados[3] = new Employee("Julia","julia@example.com",22,28_000);
        empleados[4] = new Employee("Maria","maria@example.com",22,30_000);
        empleados[5] = new Employee("Lucía","lucia@example.com",45,50_000);
        empleados[6] = new Employee("Pablo","pablo@example.com",36,22_000);
        empleados[7] = new Employee("Lucas","lucas@example.com",27,21_000);
        empleados[8] = new Employee("Victoria","victoria@example.com",31,29_000);
        empleados[9] = new Employee("Isabel","isabel@example.com",26,30_000);

        // PRACTICE WITH STATIC FUNCTIONS
        Employee.printEmpleadosToFile(empleados);

    }
}
