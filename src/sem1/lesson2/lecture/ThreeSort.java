/**
 * Created by Nazar Horshevikov
 * ISD - 13
 * https://github.com/DaNaRim/dut-java
 */

package sem1.lesson2.lecture;

import java.util.Scanner;

public class ThreeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("java ThreeSort ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println(Math.min(Math.min(a, b), c));
        System.out.println((a + b + c) / 3);
        System.out.println(Math.max(Math.max(a, b), c));
    }
}
