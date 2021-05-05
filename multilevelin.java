
class A {
    int a = 10;
}

class B extends A {
    int b = 20;

    void display() {
        System.out.println(a + "*" + b + "=" + a * b);
    }
}

class C extends B {
    int c = 30;

    void display() {
        System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
    }
}

public class multilevelin {
    public static void main(String args[]) {
        B b = new B();
        b.display();
        C c = new C();
        c.display();
    }
}
