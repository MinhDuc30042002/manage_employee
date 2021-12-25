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
public class Marketer extends Employee {
    private double kpi;
    private double tips;

    public Marketer() {
    }

    public Marketer(double kpi, double tips, String code, String name, double salary) {
        super(code, name, "Marketer", salary);
        this.kpi = kpi;
        this.tips = tips;
    }

    public double getKpi() {
        return kpi;
    }

    public void setKpi(double kpi) {
        this.kpi = kpi;
    }

    public double getTips() {
        return tips;
    }

    public void setTips(double tips) {
        this.tips = tips;
    }

    public void entry(Scanner sc) {
        super.entry(sc);
        super.setRole("Marketer");
        System.out.println("Enter your KPI: ");
        kpi = sc.nextDouble();

        System.out.println("Enter your tips: ");
        tips = sc.nextDouble();
        sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.printf("KPI: %f | Tips: %f| ", kpi, tips);
        System.out.println();
    }
}

