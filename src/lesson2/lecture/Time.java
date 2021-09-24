package lesson2.lecture;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("java Time ");
        int minutes = sc.nextInt();
        sc.close();

        System.out.println("Job takes " + minutes / 60 + " hours and " + minutes % 60 + " minutes.");
//        System.out.printf("Job takes %d hours and %d minutes.%n", minutes / 60, minutes % 60);
    }
}
