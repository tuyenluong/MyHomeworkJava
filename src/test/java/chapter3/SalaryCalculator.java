package chapter3;

import java.util.Scanner;

/*
IF statement
all salemenget payment of 1000$ a week
 */
public class SalaryCalculator {
    public static void main(String args[]) {
            //Initialize know values
            int salary = 1000;
            int bonus = 250;
            int quota = 10;

            //Get values for the unknown
            System.out.println("How many sales did the employed make this week?");
            Scanner scanner = new Scanner(System.in);
            int sales = scanner.nextInt();
            scanner.close();

            //Quick detour for the sales bonus
            if (sales >= quota) {
                salary += bonus;
            }
            //Out put
            System.out.println("The employee's pay is $" + salary);
    }
}
