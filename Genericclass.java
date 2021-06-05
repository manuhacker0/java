public class Genericclass<A> {

    A add(A a) {
        A c = a;
        return c;
    }

    public static void main(String arg[]) {
        Genericclass<Integer> ob1 = new Genericclass<Integer>();
        Genericclass<String> ob2 = new Genericclass<String>();
        int c = ob1.add(new Integer(4));
        System.out.println("number is = " + c);
        String s = ob2.add(new String("example"));
        System.out.println("String is = " + s);
    }

}
