
class cbr {
    int a;

    cbr() {
        a = 10;
    }

    void meth(cbr obj) {
        obj.a = a + obj.a;

    }
}

public class callbyreference {
    public static void main(String s[]) {
        cbr ob = new cbr();
        System.out.println("Before cbr a= " + ob.a);
        ob.meth(ob);
        System.out.println("After cbr a= " + ob.a);
    }
}
