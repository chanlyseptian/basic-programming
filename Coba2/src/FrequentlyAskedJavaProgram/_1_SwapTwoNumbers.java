package FrequentlyAskedJavaProgram;
import java.util.Scanner;
public class _1_SwapTwoNumbers {
    public static void main(String[] args) {
        int a, b;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        b = sc.nextInt();

        // Function calling
        swapTwoNumbers(a,b);
    }

    public static void swapTwoNumbers(int a, int b) {
        int temp = a;
        a= b;
        b = temp;
        System.out.println("After swapping a : " + a  + ", After swaping b : " + b);
    }
}
