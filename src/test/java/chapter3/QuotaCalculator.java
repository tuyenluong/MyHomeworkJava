package chapter3;

import java.util.Scanner;

/*
IF ELSE
All salespeple are expected to make at least 10 sales each week
For those who do, they receive a congratulatory message
For those who don't, they are informed of how many sales they were short
 */
public class QuotaCalculator {
    public static void main(String args[]){
        //Initielize values we know
        int qouta = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a deciscion  on the path to take - Output
        if (sales >= qouta){
            System.out.println("Congrats! You've met your qouta.");
        }
        else {
            int shor = qouta - sales;
            System.out.println("You sale are " + shor + " short.");
        }
    }
}
