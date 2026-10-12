package Chapter7.Interfaces;

public class MySquare implements IShapeCalculation, IGraphics{
    private int side;

    public MySquare(int side){
        this.side = side;
    }


    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public void apply(String color) {
        System.out.println("Applying " + color );
    }

    @Override
    public void draw() {
        System.out.println("Drawing square ");
    }
}
