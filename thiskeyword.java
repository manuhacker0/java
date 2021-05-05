class Sample {
    int a, b;

    void add(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a+b=" + (a + b));
    }
}

public class thiskeyword {
    public static void main(String s[]) {
        Sample ob = new Sample();
        ob.add(4, 6);
    }
}
