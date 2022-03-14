package com.company;

import java.util.Scanner;

public class DeretAngkaDenganNilaiInput {
    public static void main(String[] args) {
        // 5. Deret angka menggunakan nilai input
        // cth = angka awal 1 dengan perulangan 5 kali (1,2,3,4,5)
        // jadi setiap angka dipangkat, hasilnya jadi (1,4,9,16,25)

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.print(" " + i * i);
        }

    }
}
