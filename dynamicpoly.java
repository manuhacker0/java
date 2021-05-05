class P {
    void display() {
        System.out.println("Hi");
    }
}

class C extends P {
    void display() {
        System.out.println("Hello");
    }
}

class dynamicpoly {
    public static void main(String args[]) {
        P obj;
        obj = new C();
        obj.display();
    }
}  