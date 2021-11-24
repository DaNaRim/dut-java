package lesson5.practise;

import java.util.Scanner;

public class ISBNCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();


        int lastDigit = 0;
        for (int i = 0; i <= 10; i++) {
            int num = 0;

            int multiplier = 10;
            int divider = 100_000_000;
            int tempNum = 0;
            for (int j = 0; j < 9; j++) {
                int digit = n / divider - tempNum * 10;
                int multiDigit = multiplier * digit;

                num += multiDigit;

                tempNum = tempNum * 10 + digit;
                multiplier--;
                divider /= 10;
            }
            int fullNum = num + i;
            if (fullNum % 11 == 0) {
                lastDigit = i;
                break;
            }
        }
        System.out.println(lastDigit == 10 ? "X" : lastDigit);
        ;
    }
}
