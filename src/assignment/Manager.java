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
public class Manager extends Employee {
    private double responsibility;

    public Manager() {
    }

    public Manager(double responsibility, String code, String name, double salary) {
        super(code, name,"Manager", salary);
        this.responsibility = responsibility;
    }

    public double getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(double responsibility) {
        this.responsibility = responsibility;
    }

    public void entry(Scanner sc){
        super.entry(sc);
        super.setRole("Manager");
        System.out.println("Enter responsibility salary: ");
        responsibility = sc.nextDouble();
        sc.nextLine();

    }
    public void output(){
        super.output();
        System.out.printf("Responsibility salary: %f" , responsibility);
    }

}
