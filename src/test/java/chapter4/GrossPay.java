package chapter4;

import java.util.Scanner;

/*
WHILE LOOP
Each store employee make $12 an hour. Write a program that allows the employee
to enter the number of hour worked for the week. Do not allow over time
 */
public class GrossPay {
    public static void main(String args[]){
        //What we known.
        int rate = 15;
        int maxHours = 40;

        //Get input unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again, enter bellow:");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate gross
        double gross = hoursWorked*rate;
        System.out.println("You gross is: $" + gross);
    }
}
