class rob {
    int a;

    rob(int a) {
        this.a = a;
    }

    rob meth() {
        rob ob = new rob(10);
        return ob;
    }
}

public class returningofobjects {
    public static void main(String[] args) {
        rob obj = new rob(5);
        System.out.println("before " + obj.a);
        obj = obj.meth();
        System.out.println("after " + obj.a);
    }
}
