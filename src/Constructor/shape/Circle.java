package Constructor.shape;

public class Circle extends Shape {
    public Circle (String text) {
        super(text);
    }
    public Circle() {
        super("Call non-default base class constructor");
        System.out.println("In Circle Constructor");
    }
}
