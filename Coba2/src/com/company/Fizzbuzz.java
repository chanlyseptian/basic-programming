package com.company;

public class Fizzbuzz {
    public static void main(String[] args) {
        /*
        input : 5
        output :
        *****
        ****
        ***
        **
        *

         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan banyak data : ");
//        int data = input.nextInt();

        for (int i=0; i <=100; i++) {
            if ((i % 3) == 0 && (i % 5) == 0){
                System.out.println("Fizzbuzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
