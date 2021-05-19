package chapter9;

public class TasteTester {
    public static void main(String[] args){
        BirthdayCake bCake = new BirthdayCake();
        WeddingCake wCake = new WeddingCake();

        bCake.setFlavor("Vanilla");
        bCake.setPrice(500);
        bCake.setCandles(25);

        wCake.setFlavor("Strawberry");
        wCake.setPrice(1000);
        wCake.setTiers(5);

        System.out.println("This birthday cake have " + bCake.getFlavor()+" flavor and the price is $"+ bCake.getPrice() +".");
        System.out.println("Cause today it's specially order by a man for his women, so it will have " + bCake.getCandles() + " candles.");

        System.out.println("We also have another cake for a wedding that have "+ wCake.getTiers() + " tiers and one of the favorite flavor ");
        System.out.println("for any bride at there BIG DAY, " +wCake.getFlavor() + ". Within just only for $" + wCake.getPrice()+".");

    }
}
