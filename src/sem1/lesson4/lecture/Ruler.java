package sem1.lesson4.lecture;

import java.util.Scanner;

public class Ruler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String ruler = "1";

        for (int i = 2; i <= n; i++) {
            System.out.println(ruler);
            ruler = ruler + " " + i + " " + ruler;
        }
        System.out.println(ruler);

        /* if n >= 30
        java.lang.OutOfMemoryError: Overflow: String length out of range
         */
    }
}
