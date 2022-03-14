package SoalGolang;
import java.util.Scanner;
public class Konversi_Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama anda : ");
        String nama = sc.nextLine();
        System.out.println("Masukkan nilai anda");
        int nilai = sc.nextInt();

        if (nilai >= 80 && nilai <= 100){
            System.out.println(nama + ", nilai anda : "+ nilai + ", Anda mendapat nilai A");
        } else if (nilai >= 65 && nilai <= 79) {
            System.out.println(nama + ", nilai anda : "+ nilai + ", Anda mendapat nilai B+");
        } else if (nilai >= 50 && nilai <= 64) {
            System.out.println(nama + ", nilai anda : "+ nilai + ", Anda mendapat nilai B");
        } else if (nilai >= 35 && nilai <= 49) {
            System.out.println(nama + ", nilai anda : "+ nilai + ", Anda mendapat nilai C");
        } else if (nilai >= 0 && nilai <= 34) {
            System.out.println(nama + ", nilai anda : "+ nilai + ", Anda mendapat nilai D");
        }

    }
}
