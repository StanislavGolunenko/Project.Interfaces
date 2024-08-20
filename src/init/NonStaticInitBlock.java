package init;

public class NonStaticInitBlock {
private String name;

    public NonStaticInitBlock() {
        System.out.println("In constructor");
    }
    public static void main(String[] args) {
        NonStaticInitBlock obj = new NonStaticInitBlock();
        System.out.println(obj);

    }
}
