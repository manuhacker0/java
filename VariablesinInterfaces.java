
interface I1 {
    boolean YES = true;
    boolean NO = false;
}

class C1 implements I1 {
    boolean check(int m) {
        if (m < 18)
            return NO;
        else
            return YES;
    }
}

class C2 implements I1 {
    void verify(boolean r) {
        if (r == true) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");

        }
    }
}

class VariablesinInterfaces {
    public static void main(String args[]) {
        C1 ob1 = new C1();
        C2 ob2 = new C2();
        ob2.verify(ob1.check(17));
        ob2.verify(ob1.check(20));
    }
}
