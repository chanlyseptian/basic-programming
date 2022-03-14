package Function;

/* Recursion
input = 10
output = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
 */
public class Recursion {
    public static void main(String[] args) {

        System.out.println(sum(10));

    }

    static int sum(int k) {
        if (k>0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
