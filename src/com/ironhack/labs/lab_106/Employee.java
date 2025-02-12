package com.ironhack.labs.lab_106;

import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    private String name;
    private String email;
    private int age;
    protected double salary;

    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void printEmpleadosToFile(Employee[] empleados) throws IOException {
        FileWriter writer = new FileWriter("employees.txt", false);
        for (Employee empleado: empleados) {
            writer.write(getEmployeeData(empleado));
            // PRACTICE WITH OVERRIDING TOSTRING METHOD
            //writer.write(empleado.toString());


        }
        writer.close();
    }

    private static String getEmployeeData(Employee empleado) {
        String result = "Name: " + empleado.getName()+ ", email: "+empleado.getEmail()+", age: "+empleado.getAge()+", salary: "+empleado.getSalary()+"\n";
        return result;
    }

    @Override
    public String toString() {
        return "name=" + name + " email=" + email +" age=" + age +
                ", salary=" + salary +
                '\n';
    }
}
