package lesson6.practise;

import java.util.Scanner;

public class CityDog {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int fieldSize = sc.nextInt();
        int tries = sc.nextInt();
        sc.close();

        int deadEnds = 0;
        int exit = 0;
        for (int i = 0; i < tries; i++) {
            boolean[][] field = new boolean[fieldSize][fieldSize];

            int y = fieldSize / 2;
            int x = fieldSize / 2;
            field[y][x] = true;

            while (true) {
                if (field[y + 1][x]
                        && field[y - 1][x]
                        && field[y][x + 1]
                        && field[y][x - 1]) {
                    deadEnds++;
                    System.out.println("deadEnd");
                    break;
                }

                int way;
                boolean isValidWay;
                do {
                    isValidWay = true;
                    way = (int) (Math.random() * 4) + 1;
                    if ((way == 1 && field[y + 1][x])
                            || (way == 2 && field[y - 1][x])
                            || (way == 3 && field[y][x + 1])
                            || (way == 4 && field[y][x - 1])) {
                        isValidWay = false;
                    }
                } while (!isValidWay);

                if (way == 1) y++;
                else if (way == 2) y--;
                else if (way == 3) x++;
                else if (way == 4) x--;

                field[y][x] = true;

                if (tries < 11 && fieldSize < 31) {
                    for (int j = 0; j < field.length; j++) {
                        for (int k = 0; k < field[j].length; k++) {
                            if (j == y && k == x) {
                                System.out.print("0");
                            } else if (field[j][k]) {
                                System.out.print("*");
                            } else {
                                System.out.print(".");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    Thread.sleep(400);
                }

                if (x == 0 || y == 0 || x == fieldSize - 1 || y == fieldSize - 1) {
                    exit++;
                    System.out.println("exit");
                    break;
                }
            }
        }
        System.out.println("Total exits " + exit + ", total dead ends " + deadEnds);
        System.out.println("Exit chance " + (double) exit / tries * 100 + "%");
    }
}
