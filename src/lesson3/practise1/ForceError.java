package lesson3.practise1;

import java.util.Scanner;

public class ForceError {

    public static void main(String[] args) {
        final double G = 6.67E-11;

        Scanner sc = new Scanner(System.in);
        double mass1 = sc.nextDouble();
        double mass2 = sc.nextDouble();
        double r = sc.nextDouble();


        double force = (G * mass1 * mass2) / (r * r);
//        double force2 = G * mass1 * mass2 / r * r; //wrong
        System.out.println(force);
    }
}
