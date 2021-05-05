class B {
    void fun() {
        System.out.println("In no parameters function");
    }

    void fun(int a) {
        System.out.println("A = " + a);
    }

    void fun(double a) {
        System.out.println("A = " + a);
    }
}

public class methodoverloading {
    public static void main(String[] a) {
        B ob = new B();
        ob.fun();
        ob.fun(3);
        ob.fun(6.33);
    }
}
