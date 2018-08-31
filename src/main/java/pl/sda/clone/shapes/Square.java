package pl.sda.clone.shapes;

public class Square extends Shape{
    public Square(double side) {
        this.side = side;
    }

    private double side;
    public double area() {
        return side*side;
    }

    @Override
    public void printName() {
        //super.printName();
        System.out.println("Jestem square");
    }

    public double perimeter() {
        return 0;

    }
}
