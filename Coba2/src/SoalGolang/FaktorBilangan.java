package SoalGolang;
import java.util.Scanner;
public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in );
        System.out.println("Masukkan angka");
        int nilai = sc.nextInt();
        System.out.println("Faktor-faktornya:");
        int tambah = 0;
        for (int i = 0; i <= nilai; i++) {
            tambah++;
            if (nilai % tambah == 0) {
                System.out.println(tambah);
            }
        }
    }
}
