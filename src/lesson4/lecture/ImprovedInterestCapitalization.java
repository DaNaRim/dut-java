package lesson4.lecture;

import java.util.Scanner;

public class ImprovedInterestCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        int dollars = sc.nextInt();
        double percent = sc.nextDouble();
        sc.close();

//        double money = dollars * Math.pow(Math.E, percent * years);
//        System.out.println(money);

        for (int i = 1; i <= years * 12; i++) {
            double multiplier = Math.pow(Math.E, percent * ((double) i / 12));
            double currentSum = dollars * multiplier;
            double currentPercent = multiplier - 1;
            System.out.printf("%s%.2f%n", i + " month. Current sum = ", currentSum);
            System.out.println(i + " month. Current percent = " + (int) (currentPercent * 100));
        }
    }
}
