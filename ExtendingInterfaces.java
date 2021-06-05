interface A {
    void fun1();
}

interface B extends A {
    void fun2();
}

class C implements B {
    public void fun1() {
        System.out.println("function in Interface A");
    }

    public void fun2() {
        System.out.println("function in Interface B");
    }
}

class ExtendingInterfaces {
    public static void main(String args[]) {
        C ob = new C();
        ob.fun1();
        ob.fun2();
    }
}
