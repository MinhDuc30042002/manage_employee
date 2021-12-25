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
public class Staff extends Employee {

    public Staff() {
    }
    
    public Staff(String code, String name, double salary) {
        super(code, name,"Staff", salary);
    }
    public void entry(Scanner sc){
        super.entry(sc);
        super.setRole("Staff");
    }
    public void output(){
        super.output();
    }
}
