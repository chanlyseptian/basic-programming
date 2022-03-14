package com.company;
import java.util.Scanner;

import static java.lang.Math.pow;

public class DeretAngkaVariasi {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan banyak data : ");
//        int n = sc.nextInt();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();
//        int sum = 0;

        //no.1 = 1+2+3+4+5..N
//        for (int i = 1; i<=n; i++) {
//            System.out.print(" " + i + " +");
//            sum += i;
//        }
//        System.out.print(" = " + sum);

        //no.2 = 9+13+17..N

//        for (int i = 1, a=9; i<=n; i++, a+=4){
//            System.out.print(" " + a + " +");
//            sum += a;
//        }
//        System.out.print(" = " + sum);

//        // no. 3 = 2 + 4 + 6 + 8..N
//        for (int i = 1, a=2; i<=n; i++, a+=2){
//            System.out.print(" " + a + " +");
//            sum += a;
//        }
//        System.out.print(" = " + sum);

//        // no. 4 = 10 + 9 + 8..N
//        for (int i = 1, a=10; i<=n; i++, a--){
//            System.out.print(" " + a );
//            sum += a;
//        }
//        System.out.print(" = " + sum);

        /*----------------------LATIHAN SOAL------------------------------------*/

        /* no.1
           3,6,9,12, ...
         */

        // cara 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan banyak data : ");
//        int n = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 1, a=3; i<=n; i++, a+=3) {
//            System.out.print(" "+ a);
//            sum += a;
//        }

        //cara 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan banyak data : ");
//        int n = sc.nextInt();
//        int lipat = 3;
//
//        for (int i = 1; i <=n; i++) {
//            System.out.print(" " + lipat);
//            lipat += 3;
//        }

        /* no.2
        3, 9, 27, ...

         */

        //cara 1
//        int angka = 3;
//        for (int i= 1; i<=n; i++) {
//            System.out.print(" " + angka);
//            angka *= 3;
//        }

        //cara 2

//        for (int i = 1, a=3; i<=n; i++,a*=3) {
//            System.out.print(" " + a);
//
//        }

        /* no. 3 deret kuadrat
        1,4,9,16,25,...

         */

        //cara1
//        int hasil;
//        for (int i=1; i<=n; i++) {
//            hasil = i*i;
//            System.out.print(" "+hasil);
//
//        }

        /* no. 4 Program Faktorial
        input : 6
        output : 720
        6x5x4x3x2x1
         */
//        int hasil = 1;
//        for (int i = 1; i<=n; i++) {
//            if (n >= i) {
//                hasil *= i;
//
//            }
//
//        }
//        System.out.print(hasil);

        /* no.5 Deret Angka
        99,98,98,97,97,96

         */


        /* no.6 Deret Fibonancci
        input : 7
        output : 0,1,1,2,3,5,8,13
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan banyak data : ");
//        int n = sc.nextInt();
//
//        int n1 = 0;
//        int n2 = 1;
//        int i;
//        int hasil;
//
//        System.out.print(n1 + " " + n2);
//
//        for (i = 2; i<=n; i++) {
//            hasil = n1 + n2;
//            System.out.print(" " + hasil);
//            n1 = n2;
//            n2 = hasil;
//        }

        /* 7. Deret Angka
        4096 2048 1024 512 256 ...

         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan banyak data : ");
//        int n = sc.nextInt();
        // cara 1
//        for (int i = 1, a=4096; i<=n; i++, a/=2) {
//            System.out.print(" " + a);
//        }

        //cara 2
//        int angkaAwal = 4096;
//        for (int i = 1; i<=n; i++) {
//            System.out.print(" " + angkaAwal);
//            angkaAwal = angkaAwal / 2;
//        }

        /* no.8 Deret Angka
        1 3 6 10 15 21 ...
        +2+3+4+5+6..
         */
//        int a = 1;
//        int j = 1;
//        int i;
//
//        for (i = 1; i<=n; i++) {
//            System.out.print(" " + a);
//            j++;
//            a += j;
//        }

        /*9. Deret Arithmetic
        x^1 + x^2 + x^3 + x^4.. N
        */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan banyak data : ");
//        int n = sc.nextInt();
//        double sum = 0;
//        int angka = 2;
//
//        for (int i = 1, a=1; i<=n; i++, a++ ){
//            System.out.print(angka +"^" + a + " + ");
//            sum += Math.pow(angka, a);
//        }
//        System.out.println("\nHasilnya : "+ sum);

        /*10. Deret Arithmetic
        9^2 + 13^2 + 17^3 ... N
        */
//        double sum = 0;
//
//        for (int i = 1, a=9; i<=n; i++, a= a+4) {
//            System.out.print( a + "^" + "2" +" + ");
//            sum = sum + a * a;
//        }
//        System.out.println("\nHasilnya : " + sum);

        /* no.11 Deret Angka
        1,5,11,19,29,X,Y
        +4 + 6 + 8 + 10 ... N

         */
//        int a = 1;
//        int k = 2;
//
//        for (int i= 1; i <= n; i++) {
//            System.out.print(" " + a);
//            k = k+2;
//            a = a+k;
//        }

        /* no. 12
        1, -3 , -11, -23, -39, -59, ... N

         */
//        int a = 1;
//        int k = -4;
//
//        for (int i= 1; i<=n; i++) {
//            System.out.print(" "+ a);
//            a = a + k;
//            k = k -4;
//        }


        /* no.6 Deret Fibonancci
        input : 7
        output : 0,1,1,2,3,5,8,13
         */
//        int n1 = 0;
//        int n2 = 1;
//        System.out.print(" " + n1 + " " + n2);
//        for (int i = 1; i<=8; i++) {
//            int total = n1 + n2;
//            System.out.print(" " + total);
//            n1=n2;
//            n2=total;
//        }

        /*
        13 . Prime Number
        2, 3, 5, 7, 11, 13, 19, 23 . ..
        started from 2, 2 is the only even prime number
        */
//        Scanner sc = new Scanner(System.in);
//        int angka = sc.nextInt();
//
//
//        for (int i = 2; i <=angka; i++) {  // buat perulangan untuk mengecek angka prima
//            boolean isPrime = true; //set kondisi awal true
//            for (int j = 2; j<i; j++) { //buat perulangan untuk bisa dibagi dengan i utk mendapatkan nilai modulo, jika 0 maka bukan bilangan prima
//                if (i%j==0){
//                    isPrime = false; // jika sisa baginya 0, maka bukan prime number
//                    break; // di break agar keluar dari perulangan
//                }
//            }
//            if (isPrime) { //setelah keluar dari perulangan di cek apakah true, jika ya maka print angka i nya
//                System.out.print(" "+ i);
//            }

//        }
        int a = 2;
        int b= 3;
        int c = 4;

        if (a < b) {
            System.out.println("a lebih kecil dari b");
        } else if (b < a) {
            System.out.println("b lebih kecil dari a");
        }




    }
}
