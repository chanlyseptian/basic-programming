package com.company;

import java.util.Scanner;

public class DeretAngkaDenganInputDanOutput {
    public static void main(String[] args) {
        // 6. Deret angka berdasarkan input dan output
        // Inputan ada 2, nilai awal dan nilai berhenti
        // Output nilai hasil yaitu penjumlahan dari nilai awal sampai nilai batas akhir
        // cth = (2,3,4,5), hasilnya 14, karena 2+3 = 5, 5+4 = 9, 9+5 = 14
        int i;
        int awal;
        int akhir;
        int y = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Nilai awal : ");
        awal = input.nextInt();
        System.out.println("Nilai akhir : ");
        akhir = input.nextInt();

        for(i = awal; i <= akhir; i++) {
            y += i;
        }
        System.out.println("Hasil : " + y);
    }
}
