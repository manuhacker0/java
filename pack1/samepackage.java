package pack1;

public class samepackage {
    Data ob = new Data();

    samepackage() {
        System.out.println("default member : " + ob.a);
        System.out.println("public member : " + ob.b);
        System.out.println("protected member :" + ob.c);
        // System.out.println("private member :" + ob.d);

    }
}
