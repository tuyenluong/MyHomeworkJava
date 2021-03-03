package chapter4;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean status = false;

        do {
            System.out.println("What operater do you what to do? (+, -, *, /)");
            String operater = scanner.next();
            System.out.println("Enter first number: (Number only)");
            double a = scanner.nextDouble();
            System.out.println("Enter second number: (Number only)");
            double b = scanner.nextDouble();

            double totalSum = a + b;
            double totalSub = a - b;
            double totalMul = a * b;
            double totalDiv = a / b;

            if (operater.equals("+")){
                System.out.println("Total of addition operater is " + totalSum);
            }
            else if(operater.equals("-")){
                System.out.println("Total of subtraction operater is " + totalSub);
            }
            else if(operater.equals("*")){
                System.out.println("Total of multiplication operater is " + totalMul);
            }
            else if(operater.equals("/")){
                System.out.println("Total of division operater is " + totalDiv);
            }
            else  {
                System.out.println("Error entry. Try again with correct input.");
            }
            System.out.println("Do you want to start over? True or False");
            status = scanner.nextBoolean();
        }while (status);
    }
}
