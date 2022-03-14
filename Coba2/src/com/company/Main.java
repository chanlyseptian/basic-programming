package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        long population;
//        double growthRate;
//
//        System.out.print("Masukkan jumlah populasi sekarang: ");
//        population = sc.nextLong();
//
//        System.out.print("Masukkan jumlah pertumbungan tiap tahun: ");
//        growthRate = sc.nextDouble();
//
//        // print growth rate
//        for(int i=1; i<4; i++, population *= growthRate){
//            System.out.printf("%d tahun = %d\n", i, population);
//
//        }

        int result = 0;
        for(int i = 0; i<=5; i++) {
            if (i % 2 == 1){
                System.out.println("GANJIL");;
            } else {
                System.out.println("genap");
            }
        }
        System.out.println(result);



    }
}
