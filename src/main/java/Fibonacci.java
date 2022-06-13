import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number: ");
            int i = s.nextInt();
            int n = getFib(i);
            System.out.println(i + "th value in the series is: " + n);
        }
    }

    public static int getFib(int n) {
        return 0;
    }
}


// 1  2  3  4  5  6  7   8
// 1, 1, 2, 3, 5, 8, 11, 19 ...