package pack1;

public class Data {
    int a = 2;
    public int b = 4;
    protected int c = 6;
    private int d = 8;

    public Data() {
        System.out.println("default member : " + a);
        System.out.println("public member : " + b);
        System.out.println("protected member :" + c);
        System.out.println("private member :" + d);
    }
}
