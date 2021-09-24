/**
 * Created by Nazar Horshevikov
 * ISD - 13
 * https://github.com/DaNaRim/dut-java
 */

package lesson2.lecture;

import java.util.Scanner;

public class Percent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double percent = sc.nextDouble();
        double time = sc.nextDouble();
        sc.close();

        double newMoney = money * Math.pow(Math.E, percent * time);
        System.out.println(newMoney);
    }
}
