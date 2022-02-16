package sem1.lesson6.lecture;

import java.util.Scanner;

public class MyMinesweeper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixHeight = scanner.nextInt();
        int matrixWidth = scanner.nextInt();
        int bombChance = scanner.nextInt(); // range 1 - 99
        scanner.close();

        String[][] field = new String[matrixHeight][matrixWidth];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int rand = (int) (Math.random() * 100);
                field[i][j] = rand < bombChance ? "*" : ".";
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("*")) continue;
                int countBombs = 0;
                for (int k = i - 1; k < i + 2; k++) {
                    for (int l = j - 1; l < j + 2; l++) {
                        if (k < 0 || l < 0 || k >= field.length || l >= field[i].length) {
                            continue;
                        }
                        if (field[k][l].equals("*")) countBombs++;
                    }
                }
                field[i][j] = Integer.toString(countBombs);
            }
        }
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

}
