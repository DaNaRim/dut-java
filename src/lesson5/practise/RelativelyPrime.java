package lesson5.practise;

import java.util.Scanner;

public class RelativelyPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int nsd = Math.min(i, j);
                while (i % nsd != 0 || j % nsd != 0) {
                    nsd--;
                }
                System.out.print(nsd == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
