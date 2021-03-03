package chapter6;
import java.util.Scanner;

/*
So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over
and then a 15% tax on the subtotal.
I want you to create separate methods to calculate the tax, to calculate the overage fees,
and to calculate and print the final total.
Please print this as an itemized bill.
Enter base cost of the plan:
82.45
Enter overage minutes:
9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41
 */
public class PhoneBillCalculator2 {
    //Initialize what we know
    static double tax = 0.15;
    static double oneMinute = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        //Get what we don't know
        double baseCost = getYourPlan();
        double overageMinutes = getYourMinute();
        scanner.close();

        //Calculated tax on total
        double getTax = calculatedTax(baseCost + overageMinutes);

        //Calculate overage charges
        double getOver= calculatedOverage(overageMinutes);

        //Calculate and Print the final total.
        calculatedBillPrint(baseCost, getOver,getTax);
    }
    public static double getYourPlan(){
        System.out.println("Enter your plan fee:");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }
    public static double getYourMinute(){
        System.out.println("Enter your overage minute:");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }
    public static double calculatedTax(double enterTax){
        double getTax = enterTax * tax;
        return getTax;
    }
    public static double calculatedOverage(double enterOverage){
        double getOverage = enterOverage * oneMinute;
        return getOverage;
    }
    public static void calculatedBillPrint(double plan, double over, double tax){
        double totalBillPrint = plan + over + tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + plan);
        System.out.println("Overage: $" + over);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + totalBillPrint);
    }
}