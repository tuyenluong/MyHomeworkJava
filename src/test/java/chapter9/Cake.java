package chapter9;

public class Cake {
    private String flavor;
    private int price;

    public Cake(){
    }
    public String getFlavor() {
        return flavor;
    }

    public String setFlavor(String flavor) {
        this.flavor = flavor;
        return flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
