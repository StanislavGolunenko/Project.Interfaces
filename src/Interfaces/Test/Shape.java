package Interfaces.Test;
public abstract class Shape {
    private String name;

    public  Shape (String name) {
        this.name =name;
    }
    public String getName() {
        return name;
    }

    public abstract double getArea();
}


// Класс прямоугольник от класса Shape
class Rectangle extends Shape {
private double width;
private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }
}


// Класс квадрат от класса Shape
 class Square extends Shape {
    private double side;

    public  Square(double side) {
        super("Square");
        this.side = side;
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }


}


// Класс треугольник от класса Shape
class Triangle extends Shape {
private double base;
private double height;

public Triangle (double base, double height) {
    super("Triangle");
    this.base = base;
    this.height = height;
}
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}


// Класс ромб от класса Shape
class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus (double diagonal1, double diagonal2) {
        super("Rhombus");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    @Override
    public double getArea() {
        return 0.5 * diagonal1 * diagonal2;
    }
}

// Класс трапеция от класса Shape
class Trapezoid extends Shape {
   private double base1;
    private double base2;
    private double height;

    public Trapezoid (double base1, double base2, double height ) {
        super("Trapezoid");
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Trapezoid";
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }
}
class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("Shape: " + shape.getName());
    }

}
