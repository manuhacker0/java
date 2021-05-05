class Parent {
    void fun() {
        System.out.println("In Parent Class");
    }
}

class Child extends Parent {
    void fun(int a, int b) {
        System.out.println("A+b =" + (a + b));
    }
}

public class methodoverloadinginInhertence {
    public static void main(String[] a) {
        Child ob = new Child();
        ob.fun();
        ob.fun(5, 6);
    }
}
