public class Multiplecatch {

    public static void main(String[] args) {
        try {
            int a[], c;
            if (Integer.parseInt(args[0]) == 1) {
                a = new int[5];
                System.out.println(a[20]);
            } else if (Integer.parseInt(args[0]) == 2)
                c = 1 / 0;
            else
                a = new int[-10];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception --> " + e);
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySize Exception --> " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception --> " + e);
        }
    }
}
