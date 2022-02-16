package sem1.lesson6.lecture;

public class MatrixTransponation {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 11},
                {4, 5, 6, 12},
                {7, 8, 9, 13},
                {14, 15, 16, 17}
        };

        int startFrom = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = startFrom; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
            startFrom++;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
