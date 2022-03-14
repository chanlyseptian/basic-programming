package com.company;

import java.util.Scanner;

public class PotonganDiskon {
    public static void main(String[] args) {
        // 3. Program Potongan Diskon
        double diskon;
        double potongan;
        double input;
        double totalbelanja;

        System.out.println("Masukkan total belanja : ");
        Scanner in = new Scanner(System.in);
        input = in.nextDouble();

        if (input < 400000){
            diskon = 0.1;
        } else if ((input >= 400000) && (input <=500000)) {
            diskon = 0.2;
        } else if ((input > 500000) && (input <= 650000)) {
            diskon = 0.3;
        } else if((input > 650000) && (input <= 800000)) {
            diskon = 0.5;
        } else if ((input > 800000) && (input <= 1000000)) {
            diskon = 0.7;
        } else {
            diskon = 0;
        }

        potongan = input * diskon;
        totalbelanja = input - potongan;
        System.out.println("Anda mendapatkan diskon sebesar " + diskon * 100+ "% " );
        System.out.println("potongan harga sebesar " + potongan);
        System.out.println("Total belanja anda adalah : " + totalbelanja);

    }
}
