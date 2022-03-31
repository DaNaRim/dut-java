/**
 * ISD13
 * Nazar Horshevikov
 * 31.03.2022
 */
package dataStructures.lesson3;

public class LinearSearchOpt {

    public static void main(String[] args) {
        int arrayLength = 15;

        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // display array
        displayArray(array);

        // linear search
//        int sk = 6;
//        int answer = -1;
//        int counter = 0;
//        for (int i = 0; i < array.length; ++i) {
//            ++counter;
//            if (array[i] == sk) {
//                answer = i;
//                System.out.println("element " + sk + " was found at index " + answer);
//            }
//        }

        // linear search optimized 1
//        int sk = 6;
//        int answer = -1;
//        int counter = 0;
//        for (int i = 0; i < array.length; ++i) {
//            ++counter;
//            if (array[i] == sk) {
//                answer = i;
//                System.out.println("element " + sk + " was found at index " + answer);
//                break;
//            }
//        }


        // linear search optimized 2
        int sk = 6;
        int counter = 0;
        int last = array[array.length - 1];
        array[array.length - 1] = sk;
        int i = 0;
        while (array[i] != sk) {
            ++i;
        }
        array[array.length - 1] = last;

        if (i < array.length - 1 || array[array.length - 1] == sk) {
            System.out.println("element " + sk + " was found at index " + i);
        } else {
            System.out.println("element " + sk + " was not found");
        }

        System.out.println("Number of comparisons is " + i);

        // System.out.println("element "+sk+" was found at index "+answer);

    }

    public static void displayArray(int[] array) {
        // [0:34] [1:67] [2:89] []
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + ":" + array[i] + "] ");
        }
        System.out.println();
    }

}
