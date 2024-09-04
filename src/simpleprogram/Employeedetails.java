package simpleprogram;

import java.util.Scanner;

public class Employeedetails {

	String name;
    String department;
    double basicPay;

    
    static  double DA = 56;
    static  double FA = 5000;
    static  double PF = 20;
    static  double TAX = 7.8;

   
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Department: ");
        department = scanner.nextLine();
        System.out.print("Enter Basic Pay: ");
        basicPay = scanner.nextDouble();
    }

    
  public void calculateDetails() {
        double da = (DA / 100) * basicPay;
        double pf = (PF / 100) * basicPay;
        double tax = (TAX / 100) * basicPay;

        double grossPay = basicPay + da + FA;
        double deduction = pf + tax;
        double netPay = grossPay - deduction;

        // Print details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("BasicPay: $" + basicPay);
        System.out.println("DA: " + da);
        System.out.println("FA: " + FA);
        System.out.println("PF: " + pf);
        System.out.println("TAX: " + tax);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Pay: " + netPay);
    }

    public static void main(String[] args) {
        
    	Employeedetails employee1 = new Employeedetails();
        
        System.out.println("Enter details for Employee:");
        employee1.getInput();

        System.out.println("\nCalculating details for Employee");
        employee1.calculateDetails();

        
    }
}