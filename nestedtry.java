public class nestedtry {
    // Illustrate nested try
    static void func(int x) {
        try {
            int a = 100 / (x - 1);
            int arr[] = new int[-1];
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught in inner catch");
        } catch (NegativeArraySizeException e) {
            System.out.println("negative array size exception in nested catch");
        }
    }

    public static void main(String s[]) {
        int a = s.length;
        try {
            int b = 5 / a;
            func(a);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught in outer catch");
        }
    }
}
