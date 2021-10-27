package lesson4.lecture;

import java.util.Scanner;

public class CoolingByWindGravity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        double velocity = sc.nextDouble();
        sc.close();

        if (temperature > 50) {
            System.err.println("temperature must be less than 51");
        } else if (velocity < 3 || velocity > 120) {
            System.err.println("velocity must be greater than 2 and less than 121");
        } else {
            double w = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);
            System.out.println("w = " + w);
        }
    }
}
