package lesson2.lecture;

import java.util.Scanner;

public class Eggsactly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Java Eggsactly ");
        int eggs = sc.nextInt();
        sc.close();

        System.out.println(eggs / 12 + " " + eggs % 12);
    }
}
