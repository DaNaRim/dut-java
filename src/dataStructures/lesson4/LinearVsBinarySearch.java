package dataStructures.lesson4;

public class LinearVsBinarySearch {

    private static final int[] array = new int[500_000];

    static {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        linearSearch(249_999);
        binarySearch(249_999);

        linearSearch(15);
        binarySearch(15);

        linearSearch(495_001);
        binarySearch(495_001);
    }

    public static int binarySearch(int sk) {
        int low = 0;
        int high = array.length - 1;

        int counter = 0;
        while (low <= high) {
            counter++;
            int mid = (low + high) / 2;

            if (array[mid] < sk) {
                low = mid + 1;
            } else if (array[mid] > sk) {
                high = mid - 1;
            } else {
                System.out.println("binarySearch: el = " + sk + " operations = " + counter);
                return counter;
            }
        }
        return -1;
    }

    public static int linearSearch(int sk) {
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            counter++;
            if (array[j] == sk) {
                System.out.println("linearSearch: el = " + sk + " operations = " + counter);
                return counter;
            }
        }
        return -1;
    }
}
