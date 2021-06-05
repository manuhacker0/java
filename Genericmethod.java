public class Genericmethod {
    public static <E> void printarry(E[] inputarry) {
        for (E element : inputarry) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] arry1 = { 1, 2, 3, 4 };
        printarry(arry1);
        Double[] arry2 = { 1.1, 2.2, 3.2, 4.2 };
        printarry(arry2);
    }
}
