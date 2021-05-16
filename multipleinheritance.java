interface A5 {
    void disp();
}

class M {
    int a;

    void mult() {
        System.out.println("In Parent class");
    }

}

class N extends M implements A5 {
    public void disp() {
        System.out.println("In child class");
    }

}

public class multipleinheritance {
    public static void main(String str[]) {
        N ob = new N();
        ob.mult();
        ob.disp();

    }
}
