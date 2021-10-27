package lesson4.lecture;

import java.util.Scanner;

public class ImprovedTenOfHellos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String suffix;
        for (int i = 1; i <= n; i++) {

            if (i % 100 == 11 || i % 100 == 12 || i % 100 == 13) {
                suffix = "th";
            } else if (i % 10 == 1) {
                suffix = "st";
            } else if (i % 10 == 2) {
                suffix = "nd";
            } else if (i % 10 == 3) {
                suffix = "rd";
            } else {
                suffix = "th";
            }
            System.out.println(i + suffix + " Hello");
        }
    }
}
