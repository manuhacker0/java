class cbv {
    int a = 10;

    void meth(int l) {
        l = 10 + l;
    }
}

public class callbyvalue {
    public static void main(String s[]) {
        cbv ob = new cbv();
        System.out.println("Before cbv a = " + ob.a);
        ob.meth(ob.a);
        System.out.println("after cbv a = " + ob.a);
    }
}