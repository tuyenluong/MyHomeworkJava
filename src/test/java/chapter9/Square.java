package chapter9;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("T am a " + what);
    }
}
