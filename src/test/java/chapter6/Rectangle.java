package chapter6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){//Default Constructor
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width){//Parameters Constructor
        this.length = length;//can be set by this way
        setWidth(width);//or can be set in this way
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (length * 2) + (width * 2);
    }
    public double calculateArea(){
        return length * width;
    }
}
