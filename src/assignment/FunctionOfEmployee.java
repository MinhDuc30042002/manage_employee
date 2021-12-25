/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FunctionOfEmployee {
    private final ArrayList<Employee> list = new ArrayList<>();

    public void menu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--------------------------------");
            System.out.println("Manage of CTY");
            System.out.println("1. Enter list worker");
            System.out.println("2. Show off list worker");
            System.out.println("3. Searching by code or name");
            System.out.println("4. Delete by code or name");
            System.out.println("5. Update information");
            System.out.println("6. Find by salary");
            System.out.println("7. Sort name");
            System.out.println("8. Sort salary");
            System.out.println("9. Show list 5 workers have salary higher");
            System.out.println("0. Exit");
            System.out.println("------------------------------");
            System.out.println("Choose your number?");
            int select = sc.nextInt();
            sc.nextLine();
            if (select == 0){
                System.exit(0);
            }
            switch (select) {
                case 1 -> role();
                case 2 -> outputList();
                case 3 -> searchBy(sc);
                case 4 -> deleteBy(sc);
                case 5 -> updateBy(sc);
                case 6 -> findBySalary(sc);
                case 7 -> collectionSortByName();
                case 8 -> show5Worker();
            }
        }
    }

    public void insertStaff(Scanner sc){
        do {
            Staff staff = new Staff();
            staff.entry(sc);
            list.add(staff);
            System.out.println("Do you want continue ? Yes or No");
        } while (!sc.nextLine().equalsIgnoreCase("No"));
    }

    public void insertManager(Scanner sc){
        do {
            Marketer marketer = new Marketer();
            marketer.entry(sc);
            list.add(marketer);
            System.out.println("Do you want continue ? Yes or No");
        } while (!sc.nextLine().equalsIgnoreCase("No"));

    }

    public void insertMarketer(Scanner sc){
        do {
            Manager manager = new Manager();
            manager.entry(sc);
            list.add(manager);
            System.out.println("Do you want continue ? Yes or No");
        } while (!sc.nextLine().equalsIgnoreCase("No"));
    }
    public void role(){
        Scanner sc = new Scanner(System.in);
        list.clear();

    do{
            System.out.println("Enter your role: ");
            System.out.println("1. Staff");
            System.out.println("2. Marketer");
            System.out.println("3. Manager");
            System.out.println("0. Exit");
            String role = sc.nextLine();

        if(role == null || role.equals("0")) break;
        
        int parseRole = Integer.parseInt(role);
        switch (parseRole) {
            case 1 -> insertStaff(sc);
            case 2 -> insertMarketer(sc);
            case 3 -> insertManager(sc);
        }
    }while(true);
    }


    public void outputList(){
        System.out.println("List of employee");
        for (Employee employee : list) {
            if(employee instanceof Staff){
                employee.output();
                }else if(employee instanceof Marketer){
                    employee.output();
                }if(employee instanceof Manager){
                    employee.output();
            }
            }

    }
    public void searchBy(Scanner sc){
        do {
            System.out.println("1. Search by code");
            System.out.println("2. Search by name");
            System.out.println("0. Exit");
            System.out.println("Please choose your number function ?");
            String search = sc.nextLine();
//            sc.nextLine();
            if(search == null || search.equals("0")) break;

            int parseSearch = Integer.parseInt(search);
            switch (parseSearch) {
                case 1 -> searchByCode(sc);
                case 2 -> searchByName(sc);
            }
        }while (true);
    }
    public void searchByCode(Scanner sc){
     System.out.println("Please enter code do you want: ");
        String code = sc.nextLine();
        Employee searched = null;

        // compares two string
        for (Employee value : list) {
            if(value.getCode().equalsIgnoreCase(code)){
                searched = value;
                break;
            }    
        }

        if(searched != null ){
            System.out.println("This is a code do you want: ");
            searched.output();
        }else{
            System.out.println("Error don't exist code do you want " + code);
        }
    }
    public void searchByName(Scanner sc){
     System.out.println("Please enter name do you want: ");
        String name = sc.nextLine();
        Employee searched = null;

        for (Employee value : list) {
            if(value.getName().equalsIgnoreCase(name)){
                searched = value;
                break;
            }    
        }

        if(searched != null ){
            System.out.println("This is a name do you want: ");
            searched.output();
        }else{
            System.out.println("Error don't exist name do you want " + name);
        }
    }
    public void deleteBy(Scanner sc){
            while(true){
            System.out.println("1. Delete by code");
            System.out.println("2. Delete by name");
            System.out.println("0. Exit");
            System.out.println("Choose your number ?");
            String number = sc.nextLine();

            if(number == null || number.equals("0")) break;

            int parseNumber = Integer.parseInt(number);
                switch (parseNumber) {
                    case 1 -> deleteByCode(sc);
                    case 2 -> deleteByName(sc);
                    default -> System.out.println("Please choose number 1,2 or 0");
                }
            } 
    }
    public void deleteByCode(Scanner sc){
        System.out.println("Enter code do you want delete: ");
        String code = sc.nextLine();
        Employee searched = null;
        for (Employee value : list) {
            if(value.getCode().equalsIgnoreCase(code)){
                searched = value;
                break;
            }    
        }
        if(searched != null ){
            list.remove(searched);
            System.out.println("Deleted");
        }else{
            System.out.println("Code don't exist " + code);
        }
        
    }
    public void deleteByName(Scanner sc){
        System.out.println("Enter your name do you want delete: ");
        String name = sc.nextLine();
        Employee searched = null;
        for (Employee value : list) {
            if(value.getName().equalsIgnoreCase(name)){
                searched = value;
                break;
            }    
        }
        if(searched != null ){
            list.remove(searched);
            System.out.println("Deleted");
        }else {
            System.out.println("Name don't exist " + name);
        }
        
    }
    public void updateBy(Scanner sc){
        System.out.print("Enter code do you want update: ");
        String code = sc.nextLine();
        Employee searched = null;
        for (Employee value : list) {
            if (value.getCode().equalsIgnoreCase(code)) {
                searched = value;
                break;
            }
        }
        if (searched != null) {
            if(searched instanceof Staff){
                System.out.println("Update");
                searched.entry(sc);
                System.out.println("Success !");
            }
            if(searched instanceof Marketer) {
                System.out.println("Update");
                searched.entry(sc);
                System.out.println("Success !");
            }
            if (searched instanceof Manager) {
                System.out.println("Update");
                searched.entry(sc);
                System.out.println("Success !");
            }
        }else{
                System.out.println("Code don't exist " + code);
        }
    }
    public void findBySalary(Scanner sc){
        System.out.println("Enter min salary: ");
        double min = sc.nextDouble();
        
        System.out.println("Enter max salary: ");
        double max = sc.nextDouble();
        boolean finding = true;
        for (Employee value : list) {
            if (min <= value.getSalary() && value.getSalary() <= max) {
                value.output();
                finding = false;
            }
        }
        if(finding){
            System.out.println("Don't have any worker to " + min + " from " + max);
        }
    }
    public void collectionSortByName(){
        list.sort((a, b) -> a.name.compareTo(b.getName()));
    }
    public void show5Worker(){
        list.sort((a, b) -> (int) (b.getSalary() - a.getSalary()));
        System.out.println("List 5 workers have salary higher");
        for(int i = 0; i < 5 || i < list.size(); i++){
           list.get(i).output();
        }
    }
    }
    
    

