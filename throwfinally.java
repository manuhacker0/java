public class throwfinally {
    // Illustrate throws and finally
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun Method");
        throw new IllegalAccessException();
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally Block");
        }
    }
}
