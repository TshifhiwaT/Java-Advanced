package Chapter7.Interfaces;

public class MyShape {
    protected double length, width;

    public MyShape(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return this.length * this.width;
    }
}
