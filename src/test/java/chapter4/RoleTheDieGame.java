package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RoleTheDieGame {
    public static void main(String args[]) {
        int numberOfSpace = 20;
        int numberOfRolls = 5;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rolls = 0;
        int totalStep = 0;
        for (int i = 0; i <numberOfRolls; i++){


            for (int j = 0; j < numberOfSpace; j++){
                System.out.println("Enter any key to play game:");
                String anykey = scanner.next();
                int die = random.nextInt(6) + 1;
                }
            }
        }
    }



