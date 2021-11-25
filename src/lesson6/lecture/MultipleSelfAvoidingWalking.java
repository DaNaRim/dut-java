package lesson6.lecture;

import java.util.Scanner;

public class MultipleSelfAvoidingWalking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("matrix size: ");
        int n = scanner.nextInt();
        System.out.print("attempts count: ");
        int attempts = scanner.nextInt();
        scanner.close();

        int attemptsSum = 0;
        int attemptsCount = 0;
        for (int i = 0; i < attempts; i++) {
            boolean[][] path = new boolean[n][n]; // y -> down, x -> right

            int currentX = n / 2;
            int currentY = n / 2;
            path[currentY][currentX] = true;

            int moves = 0;
            int trueSells = 1;
            do {
                int way;
                boolean isValidWay;
                do {
                    isValidWay = true;
                    way = (int) (Math.random() * 4);
                    if ((way == 0 && currentX == n - 1)
                            || (way == 1 && currentX == 0)
                            || (way == 2 && currentY == n - 1)
                            || (way == 3 && currentY == 0)) {
                        isValidWay = false;
                    }
                } while (!isValidWay);

                if (way == 0) currentX++;
                else if (way == 1) currentX--;
                else if (way == 2) currentY++;
                else if (way == 3) currentY--;

                if (!path[currentY][currentX]) {
                    path[currentY][currentX] = true;
                    trueSells++;
                }
                moves++;
            } while (trueSells != n * n);
            System.out.println(moves);
            attemptsSum += moves;
            attemptsCount++;
        }
        System.out.println("average attempts :" + (double) attemptsSum / attemptsCount);
    }
}
