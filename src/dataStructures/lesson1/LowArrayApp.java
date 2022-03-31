/**
 * ISD13
 * Nazar Horshevikov
 * 17.02.2022
 */
package dataStructures.lesson1;

public class LowArrayApp {
    static LowArray arr = new LowArray(50);
    static int nElems = 0;

    public static void main(String[] args) {
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 0);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;

        printArray();
        find(55);
        find(260);
        delete(55);
        printArray();
    }

    private static void delete(int value) {
        for (int i = 0; i < nElems; i++) {
            if (arr.getElem(i) != value) continue;
            for (int j = i; j < nElems; j++) {
                arr.setElem(j, arr.getElem(j + 1));
            }
            nElems--;
            System.out.println("Deleted " + value);
            return;
        }
        System.out.println("Can't delete: " + value + " not found");
    }

    private static void find(int value) {
        for (int i = 0; i < nElems; i++) {
            if (arr.getElem(i) != value) continue;
            System.out.println("Found " + value + ", index " + i);
            return;
        }
        System.out.println("Can't find " + value);
    }

    private static void printArray() {
        System.out.print("[");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr.getElem(i) + ", ");
        }
        System.out.println("\b\b]");
    }
}
