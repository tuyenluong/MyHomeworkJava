package chapter5;

/*
VARIABLE SCOPE
Write an 'instant credit check' program that approves
anyone who make more than $25,000 and has a credit score
of 700 or better. Reject all other
 */

import java.util.Scanner;

public class InstantCreditCheck {
    //Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditscore();
        scanner.close();

        //Check if user is qualified
        boolean qualified = isUserQuilified(salary,creditScore);

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditscore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;

    }
    public static boolean isUserQuilified(double salary, int creScore){
        if(creScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approve.");
        }
        else {
            System.out.println("Sorry. You've been declined.");
        }
    }
}
