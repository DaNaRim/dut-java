package dataStructures.lesson6.version2;

public interface ArrayFiller {

    int[] fill(int n);

}

class RandomFiller implements ArrayFiller {
    @Override
    public int[] fill(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int randomIndex;
            do {
                randomIndex = (int) Math.round(Math.random() * (n - 1));
            } while (array[randomIndex] != 0);

            array[randomIndex] = i + 1;
        }
        return array;
    }
}

class ReverseFiller implements ArrayFiller {
    @Override
    public int[] fill(int n) {
        int[] array = new int[n];

        for (int i = n; i > 0; i--) {
            array[n - i] = i;
        }
        return array;
    }
}

class AlmostSortedFiller implements ArrayFiller {

    private static final int SWAP_COUNT = 1;

    @Override
    public int[] fill(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < SWAP_COUNT; i++) {
            int i1 = (int) Math.round(Math.random() * (n - 1));
            int i2 = (int) Math.round(Math.random() * (n - 1));

            int temp = array[i1];
            array[i1] = array[i2];
            array[i2] = temp;
        }
        return array;
    }
}
