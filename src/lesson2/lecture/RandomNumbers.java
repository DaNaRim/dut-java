package lesson2.lecture;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(new Random().nextInt(b - a) + a);

//        System.out.println((int) (Math.random() * (b - a)) + a);
    }
}
