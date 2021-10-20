package lesson4.practice;

public class DisplayBy5InRow {

    public static void main(String[] args) {

        int countInRow = 1;
        for (int i = 1000; i <= 2000; i++) {

            System.out.print(i);

            if (countInRow == 5) {
                System.out.println();
                countInRow = 1;
            } else {
                System.out.print(" ");
                countInRow++;
            }
        }
    }
}
