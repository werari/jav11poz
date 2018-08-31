package pl.sda.clone.shapes;

public class App {
    public static void main(String[] args) {
        Circle newCircle= new Circle(5);
        newCircle.printName();
        System.out.println(newCircle.area());
        Square newSquare = new Square(10);
        newSquare.printName();
        System.out.println(newSquare.area());

        Shape circle = new Circle(10);
        ((Circle)circle).printDiameter();

    }
}
