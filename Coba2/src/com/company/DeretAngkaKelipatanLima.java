package com.company;
import java.util.Scanner;
public class DeretAngkaKelipatanLima {
    public static void main(String[] args) {
        // 7. Program Tampil Kelipatan 5
        int i;
        int kelipatan = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya data : ");
        int data = input.nextInt();

        for(i = 1; i<=data; i++) {
            System.out.print(" " + kelipatan);
            kelipatan += 5;
        }
    }
}
