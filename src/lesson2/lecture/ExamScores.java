package lesson2.lecture;

import java.util.Scanner;

public class ExamScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("java PercentScore ");
        int firstRight = sc.nextInt();
        int firstAll = sc.nextInt();
        int secondRight = sc.nextInt();
        int secondAll = sc.nextInt();
        sc.close();

        double markInPercent = (double) (firstRight + secondRight) / (firstAll + secondAll);
        System.out.println(markInPercent);
    }
}
