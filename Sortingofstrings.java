import java.util.*;

class Sortingofstrings {
    public static void main(String args[]) {
        int i, j, n;
        String temp;
        String s[] = new String[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of Strings : ");
        n = input.nextInt();
        System.out.println("Enter the strings : ");
        for (i = 0; i < n; i++)
            s[i] = input.next();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (s[j].compareTo(s[j + 1]) > 0) {
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted strings are : ");
        for (i = 0; i < n; i++)
            System.out.println(s[i]);
    }
}
