package chapter11;

public class ShapeTester {
    public static void main(String[] args){

        Shape retangle = new Rectangle(12,5);
        retangle.print();
        System.out.println(retangle.calculateArea());
    }
}
