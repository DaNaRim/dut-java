/**
 * ISD13
 * Nazar Horshevokov
 * 17.02.2022
 */
package dataStructures.lesson1;

public class LowArray {
    private long[] arr;

    public LowArray(int size) {
        arr = new long[size];
    }

    public void setElem(int index, long value) {
        arr[index] = value;
    }

    public long getElem(int index) {
        return arr[index];
    }
}
