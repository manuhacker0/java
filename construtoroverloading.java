class A {
    int a;

    A() {
        System.out.println("In default construtor");
    }

    A(int a) {
        this.a = a;
        System.out.println("The value of A is " + a);
    }
}

class construtoroverloading {
    public static void main(String s[]) {
        new A();
        new A(6);
    }

}
