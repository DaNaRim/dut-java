/**
 * ISD13
 * Nazar Horshevokov
 * 17.02.2022
 */
package dataStructures.lesson1;

public class HighArray {
    private long[] arr;
    private int nElems;

    public HighArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public void find(int key) {
        for (int i = 0; i < nElems; i++) {
            if (arr[i] != key) continue;
            System.out.println("Found " + key + ", index " + i);
            return;
        }
        System.out.println("Can't find " + key);
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void delete(long value) {
        for (int i = 0; i < nElems; i++) {
            if (value != arr[i]) continue;
            for (int j = i; j < nElems; j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
            System.out.println("Deleted " + value);
            return;
        }
        System.out.println("Can't delete: " + value + " not found");
    }

    public void printArray() {
        System.out.print("[");
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println("\b\b]");
    }
}
