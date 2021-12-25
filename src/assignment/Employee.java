/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Employee {
    String code, name, role;
    double salary;

    public Employee() {
    }

    public Employee(String code, String name, String role, double salary) {
        this.code = code;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }



    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public void entry(Scanner sc){
        System.out.println("Code: ");
        this.code = sc.nextLine();
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Salary: ");
        this.salary = sc.nextDouble();
        sc.nextLine();
    }
    public void output(){
        System.out.printf("Code: %s | Full name: %s | Role: %s | Salary: %f |"
        , code, name, role, salary);
        System.out.println();
    }
}
