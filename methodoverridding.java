class One {
    void display() {
        System.out.println("In class one");
    }
}

class Two extends One {
    void display() {
        super.display();
        System.out.println("In class two");
    }

}

class methodoverridding {
    public static void main(String s[]) {
        // One ob = new One();
        // ob.display();
        Two obj = new Two();
        obj.display();
        System.out.println("Hello");
    }
}
