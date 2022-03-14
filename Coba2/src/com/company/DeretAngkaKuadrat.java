package com.company;

public class DeretAngkaKuadrat {
    public static void main(String[] args) {
        // 4. Program deret angka kuadrat
        System.out.println("Menggunakan for");
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print(" " + i * i);
        }
        System.out.println();
        System.out.println("------------------------------");

        System.out.println("Menggunakan while");
        int j = 1;
        while (j <= 10) {
            System.out.print(" " + j * j);
            j++;
        }
        System.out.println();
        System.out.println("------------------------------");

        System.out.println("do while");
    }
}
