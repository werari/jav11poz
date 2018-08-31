package pl.sda.clone.shapes;

public class Circle extends Shape {
    public static final double PI=3.14;
    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public void printName() {
      //  super.printName(); wywołanie z klasy nadrzędnej
        System.out.println("Jestem circle");
    }
     public void printDiameter(){
         System.out.println("Srednia:"+2*radius);
     }
}
