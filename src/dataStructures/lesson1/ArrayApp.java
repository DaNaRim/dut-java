/**
 * ISD13
 * Nazar Horshevikov
 * 17.02.2022
 */
package dataStructures.lesson1;

public class ArrayApp {
    static long[] arr = new long[50];
    static int nElems;

    public static void main(String[] args) {
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;

        printArray();
        find(22);
        find(220);
        delete(11);
        printArray();
    }

    private static void delete(int value) {
        for (int i = 0; i < nElems; i++) {
            if (arr[i] != value) continue;
            for (int j = i; j < nElems; j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
            System.out.println("Deleted " + value);
            return;
        }
        System.out.println("Can't delete: " + value + " not found");
    }

    private static void find(int value) {
        for (int i = 0; i < nElems; i++) {
            if (arr[i] != value) continue;
            System.out.println("Found " + value + ", index " + i);
            return;
        }
        System.out.println("Can't find " + value);
    }

    private static void printArray() {
        System.out.print("[");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
