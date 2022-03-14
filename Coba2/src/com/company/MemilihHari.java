package com.company;
import java.util.Scanner;

public class MemilihHari {
    public static void main(String[] args) {

        // 2. Program memilih hari
        Scanner in = new Scanner(System.in);
        int hari;
        System.out.println("Masukkan angka : ");
        hari = in.nextInt();
        switch (hari){
            case 1:
                System.out.println("Angka"+hari+ "Hari senin");
                break;
            case 2:
                System.out.println("Angka"+hari+ "Hari selasa");
                break;
            case 3:
                System.out.println("Angka"+hari+ "Hari rabu");
                break;
            case 4:
                System.out.println("Angka"+hari+ "Hari kamis");
                break;
            case 5:
                System.out.println("Angka"+hari+ "Hari jumat");
                break;
            case 6:
                System.out.println("Angka"+hari+ "Hari sabtu");
                break;
            case 7:
                System.out.println("Angka"+hari+ "Hari minggu");
                break;
            default:
                System.out.println("Angka salah!");
        }
    }
}
