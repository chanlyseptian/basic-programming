package ArrayExercise;

import java.util.Scanner;

public class ArrayExerciseInputArrayLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i<n; i++) {

            arr[i] = n - i;
        }
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i]);
        }
    }
}
