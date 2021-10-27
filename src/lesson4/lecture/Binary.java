package lesson4.lecture;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

//        System.out.println(Integer.toBinaryString(n));

        int powerOfTwo = 1;

        while (powerOfTwo <= n / 2) {
            powerOfTwo *= 2;
        }

        while (powerOfTwo > 0) {
            if (n < powerOfTwo) {
                System.out.print(0);
            } else {
                System.out.print(1);
                n -= powerOfTwo;
            }
            powerOfTwo /= 2;
        }
    }
}
