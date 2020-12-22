import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] x = new int[size];
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }
        boolean mirror = true;
        for (int i = 0, j = x.length-1; i < x.length / 2; i++, j--) {
            int a = x[i];
            int ka = 0;
            while (a > 0) {
                a /= 10;
                ka++;
            }
            int b = x[j];
            int kb = 0;
            while (b > 0) {
                b /= 10;
                kb++;
            }
            if (ka!=kb) {
                mirror = false;
                break;
            }
            a = x[i];
            b = x[j];
            int[] ca = new int[ka];
            int[] cb = new int[kb];
            for (int k = 0; k < ka; k++) {
                ca[k] = a % 10;
                a /= 10;
                cb[k] = b % 10;
                b /= 10;
            }
            boolean f = true;
            for (int first = 0, second = ka-1; first < ka; first++, second--) {
                if (ca[first]!=cb[second]) {
                    f = false;
                    break;
                }
            }
            if (!f) {
                mirror = false;
                break;
            }
        }
        if (mirror) {
            System.out.println("Array is mirrored");
        } else {
            System.out.println("Array is not mirrored");
        }
    }

}

// byte, short, int, long
// float, double
// char
// boolean