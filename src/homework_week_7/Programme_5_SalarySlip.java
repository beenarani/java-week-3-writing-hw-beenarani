package homework_week_7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | DA 8% : 2250.0 |
 * | TA 9% : 2000.0 |
 * | PF - 20%; : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Employeeid: ");
        int employeeid = scanner.nextInt();
        System.out.println("Enter Basic Salary");
        Double basicSalary = scanner.nextDouble();
        //Calculating HRA,DA,TA AND PF
        double hra = calculatehra(basicSalary);
        double da = calculateda(basicSalary);
        double ta = calculateta(basicSalary);
        double pf = calculatepf(basicSalary);

        //calculating the gross salary
        double grossSalary = basicSalary +  hra + ta + da + pf;
        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:"            + employeeid + " |");
        System.out.println("|Employee Name:"                + name + "           |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "    |");
        System.out.println("|HRA 10%     : " + hra + "            |");
        System.out.println("|TA 8%       : " + ta + "             |");
        System.out.println("|DA 9%       : " + da + "             |");
        System.out.println("|PF -20%     : " + pf + "             |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "    |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
    }
    // Calculating HRA
    public static double calculatehra(double basicSalary) {
        return (basicSalary * 10) / 100;
    }
    // Calculating DA
    public static double calculateda(double basicSalary) {
        return (basicSalary * 8) / 100;
    }
    // Calculating TA
    public static double calculateta(double basicSalary) {
        return (basicSalary * 9) / 100;
    }
    // Calculating PF
    public static double calculatepf(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}