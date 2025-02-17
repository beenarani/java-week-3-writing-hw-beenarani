package homework_week_7;

import java.util.Scanner;

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller name: ");
        String name = scanner.nextLine();
        System.out.println("Enter seller ID:");
        int sellerID = scanner.nextInt();
        System.out.println("Enter Sales Amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter your Salary:");
        int basicSalary = scanner.nextInt();
        //creating the object to call instance method
        Programme_7_SalesCommission obj = new Programme_7_SalesCommission();
        int grossSalary = basicSalary+obj.calculateCommission(salesAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + sellerID);
        System.out.println("Seller's sales amount is  : " + salesAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);
        // closing the scanner object
        scanner.close();
    }
    // Calculating the sales commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

}
