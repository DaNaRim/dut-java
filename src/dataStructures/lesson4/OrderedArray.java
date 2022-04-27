package dataStructures.lesson4;

public class OrderedArray {

    private final int[] array;
    private int nElems;

    public OrderedArray(int max) {
        array = new int[max];
    }

    public int insert(int x) {
        if (nElems == array.length) return -1;
        int i;
        for (i = 0; i < nElems; i++) {
            if (array[i] <= x) continue;

            for (int j = nElems - 1; j >= i; j--) {
                array[j + 1] = array[j];
            }
            break;
        }
        array[i] = x;
        nElems++;
        return i;
    }

    public int binaryInsert(int x) {
        if (nElems == array.length) return -1;

        int low = 0;
        int high = nElems - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] < x) {
                low = mid + 1;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                for (int j = nElems - 1; j >= mid; j--) {
                    array[j + 1] = array[j];
                }
                array[mid] = x;
                return mid;
            }
        }
        for (int j = nElems - 1; j >= low; j--) {
            array[j + 1] = array[j];
        }
        array[low] = x;
        nElems++;

        return low;
    }

    public int binaryInsert2(int x) {
        if (nElems == array.length) return -1;

        int i = binarySearch(x);
        if (i < 0) {
            i = -i - 1;
        }
        for (int j = nElems - 1; j >= i; j--) {
            array[j + 1] = array[j];
        }
        array[i] = x;
        nElems++;

        return i;
    }


    public void display() {
        System.out.print("(" + array.length + ": " + nElems + ") ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public int binarySearch(int sk) {
        int low = 0;
        int high = nElems - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] < sk) {
                low = mid + 1;
            } else if (array[mid] > sk) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    public int delete(int x) {
        if (nElems == 0) return -1;

        for (int i = 0; i < nElems; ++i) {
            if (array[i] != x) continue;

            for (int j = i; j <= nElems - 1; j++) {
                array[j] = array[j + 1];
            }
            nElems--;
            return i;
        }
        return -1;
    }

    public int binaryDelete(int x) {

        int low = 0;
        int high = nElems - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] < x) {
                low = mid + 1;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                for (int j = mid; j <= nElems - 1; j++) {
                    array[j] = array[j + 1];
                }
                nElems--;
                return mid;
            }
        }
        return -1;
    }

    public int binaryDelete2(int x) {
        int i = binarySearch(x);
        if (i < 0) return -1;

        for (int j = i; j <= nElems - 1; j++) {
            array[j] = array[j + 1];
        }
        nElems--;
        return i;
    }

}
