import java.util.Scanner;

class trycatchthrow {
    static void vote(int num) {
        try {
            if (num < 18)
                throw new Exception();
            System.out.println("You are eligible to vote ");
        } catch (Exception e) {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Age :");
        int i = in.nextInt();
        vote(i);
    }
}
