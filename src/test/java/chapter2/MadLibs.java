package chapter2;

import java.util.Scanner;

public class MadLibs {


    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.nextLine();
        String season = scanner.nextLine();
        String wholeNumber = scanner.nextLine();

        System.out.println("This is a adjective: " + adjective);
        System.out.println("This is a season of the year: " + season);
        System.out.println("This is number of coffee you drink: " + wholeNumber);
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
