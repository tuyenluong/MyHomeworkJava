package chapter4;

import java.util.Scanner;

public class AverageTestScore {
    public static void main(String args[]){
        //What we known
        int numberOfStudent = 24;
        int numberOfTest = 5;
        Scanner scanner =new Scanner(System.in);

        //Process all student
        for(int i = 0; i <numberOfStudent; i++){
            double total = 0;
            for (int j = 0; j <numberOfTest; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }
            double average = total/numberOfTest;
            System.out.println("The average for student #" + (i+1) + " is "+ average );
        }
        scanner.close();
    }
}
