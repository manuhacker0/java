import java.util.*;

class Matrix {
    int r1, r2, c1, c2;
    int a[][] = new int[5][5];
    int b[][] = new int[5][5];
    int c[][] = new int[5][5];

    int getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of matrix A :");
        r1 = input.nextInt();
        c1 = input.nextInt();
        System.out.println("Enter the no. of rows and columns of matrix B :");
        r2 = input.nextInt();
        c2 = input.nextInt();
        if ((r1 != r2) || (c1 != c2))
            return 0;
        else {
            System.out.println("Enter Matrix A elements :");
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    a[i][j] = input.nextInt();
            System.out.println("Enter Matrix B elements :");
            for (int i = 0; i < r2; i++)
                for (int j = 0; j < c2; j++)
                    b[i][j] = input.nextInt();
            return 1;
        }
    }

    void Addition() {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++)
                c[i][j] = a[i][j] + b[i][j];
        }
    }
}

public class Matrixaddition {
    public static void main(String arg[]) {
        Matrix ob = new Matrix();
        int flag = ob.getData();
        if (flag == 0)
            System.out.println("Matrix Addition not possible ");
        else {
            ob.Addition();
            System.out.println("Resultant matrix is :");
            for (int i = 0; i < ob.r1; i++) {
                for (int j = 0; j < ob.c1; j++) {
                    System.out.print(ob.c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
