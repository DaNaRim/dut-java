package sem1.lesson4.lecture;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        for (long factor = 2; factor <= n / factor; factor++) {
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            }
        }
        if (n > 1) System.out.println(n);
    }
}
