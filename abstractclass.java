abstract class ABC {
    abstract void display();

}

class BCD extends ABC {
    void display() {
        System.out.println("In class BCD");
    }
}

class XYZ extends ABC {
    void display() {
        System.out.println("In class XYZ");
    }
}

public class abstractclass {
    public static void main(String s[]) {
        ABC ob;
        ob = new BCD();
        ob.display();
        ob = new XYZ();
        ob.display();
    }  
}
