package Constructor;

public class Point {
    private int x;
    private int y;
    public Point() {

    }

    public Point(int value) {
        this(value, value);
    }

    public Point(int x, int y) {
    this.x = x;
    this.y = y;
    }

    public Point(float x, float y) {

    }



    @Override
    public  String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("emptyPoint = " + point);
    }
}
