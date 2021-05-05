
class A1 {
    private int a, b;

    A1(int x, int y) {
        a = x;
        b = y;
        System.out.println(a + " " + b);
    }
}

class B1 extends A1 {
    int c;

    B1(int x, int y, int z) {
        super(x, y);
        c = z;
        System.out.println(c);
    }
}

public class superkeyword {
    public static void main(String args[]) {
        new B1(10, 20, 30);
    }
}
