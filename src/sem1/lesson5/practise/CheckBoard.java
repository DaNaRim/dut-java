package sem1.lesson5.practise;

import java.util.Scanner;

public class CheckBoard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            if ((i & 1) == 1) System.out.print(" ");
            for (int j = 0; j < n; j++) {
                System.out.print((j & 1) == 0 ? "*" : " ");
            }
            if ((i & 1) == 1) System.out.print("\b");
            System.out.println();
        }
    }
}
