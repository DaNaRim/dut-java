/**
 * Created by Nazar Horshevikov
 * ISD - 13
 * https://github.com/DaNaRim/dut-java
 */

package lesson2.lecture;

public class Gravity {

    public static void main(String[] args) {

        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        final double g = 9.80665;

        double distance = x0 + v0 * t + g * t * t / 2;
        System.out.println(distance);
    }
}
