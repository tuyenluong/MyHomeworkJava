package chapter3;

import java.util.Scanner;

/*
Nested Ifs
To qualify for a loan, a person must make at least $30,000
and have been working ar their current job for at least 2 years.
 */
public class LoanQualifierOperater {
    public static void main(String args[]){
        //Initielize values we know
        int requiredSalary = 30000;
        int requiredYear = 2;

        //Get unknown values
        System.out.println("Enter your Salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter number your working on current job: ");
        double years = scanner.nextDouble();

        scanner.close();

        //Make a deciscion  on the path to take - Output
        if(salary >= requiredSalary && years >= requiredYear){
            System.out.println("Congrats! Your qualify for a Loan.");
        }
        else {
            System.out.println("Sorry, must must earn at least $" + requiredSalary +
                    " to qualify for a loan.");
        }
    }
}
