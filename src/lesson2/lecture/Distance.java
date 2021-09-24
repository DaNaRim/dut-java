/**
 * Created by Nazar Horshevikov
 * ISD - 13
 * https://github.com/DaNaRim/dut-java
 */

package lesson2.lecture;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("java Distance");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);
//        System.out.printf("Distance from (0, 0) to (%d, %d) is %s%n", x, y, distance)
    }
}
