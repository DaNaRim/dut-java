package sem1.lesson4.lecture;

import java.util.Scanner;

public class NormalDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            double rand = Math.random();
            System.out.println(rand);
            sum += rand;
        }
        System.out.println("average = " + sum / n);
    }
}
