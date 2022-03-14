package Function;

public class FunctionExercise {
    public static void main(String[] args) {
//        System.out.println(perjumlahan(5,5));
//        hello();
//        nama("Chanly", "Septian");
//        nama("Chanly", "Septian", 23);
//
//        checkAge(26);
        bintang(5);
        System.out.println();
        bintang(3);
        System.out.println();
        numbers(5);

    }

    static int perjumlahan(int x, int y) {
        return x + y;
    }

    static void hello() {
        System.out.println("Hallo !");
    }

    static void nama(String namadepan, String namabelakang) {
        System.out.println("Hallo ! " + namadepan + " " + namabelakang);
    }

    static void nama(String namadepan, String namabelakang, int age) {
        System.out.println("Hallo ! " + namadepan + " " + namabelakang +
                " Umur anda " + age);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Usia belum mencukupi!");
        } else if ((age >= 18) && (age <= 25)) {
            System.out.println("Sudah Cukup Umur");
        } else {
            System.out.println("Anda sudah tua !");
        }
    }

    static int bintang(int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return n;
    }

    static int numbers(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return n;
    }
}
