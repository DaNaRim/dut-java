package dataStructures.lesson6;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo {

    private static final int[] nArray = {10_000, 25_000, 50_000, 75_000, 100_000, 125_000,
            150_000, 175_000, 200_000, 225_000};

    private static long[] timesReverse;
    private static long[] timesRandom;
    private static long[] timesAlmostSorted;

    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread(() -> timesReverse = testReverseSort());
        Thread t1 = new Thread(() -> timesRandom = testRandomSort());
        Thread t3 = new Thread(() -> timesAlmostSorted = testAlmostSort());
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        long maxTime = Stream.of(
                Arrays.stream(timesReverse).max().getAsLong(),
                Arrays.stream(timesRandom).max().getAsLong(),
                Arrays.stream(timesAlmostSorted).max().getAsLong()
        ).max(Long::compare).get();

        Artist.prepareBoard(nArray, maxTime, "bubbleSort");

        printTable(timesReverse, "Reverse array");
        printTable(timesRandom, "Random array");
        printTable(timesAlmostSorted, "Almost sorted array");

        Artist.printGraph(nArray, timesReverse, Color.RED);
        Artist.printGraph(nArray, timesRandom, Color.GREEN);
        Artist.printGraph(nArray, timesAlmostSorted, Color.BLUE);

        System.out.println("Complete!");
    }

    private static void printTable(long[] times, String tableName) {
        System.out.printf("%n%s%n%-3s %-7s %-5s%n", tableName, "", "N", "t(N)");
        for (int i = 0; i < nArray.length; i++) {
            System.out.printf("%-3d %-7d %-5s%n", i + 1, nArray[i], times[i]);
        }
    }

    private static long[] testReverseSort() {
        long[] times = new long[nArray.length];

        for (int i = 0; i < nArray.length; i++) {
            int[] array = ArrayUtil.fillReverseSorted(nArray[i]);

            long start = System.currentTimeMillis();
            Sorter.bubbleSort(array);
            long result = System.currentTimeMillis() - start;

            System.out.println("ReverseSort: length = " + array.length + " time = " + result + " millis");
            times[i] = result;
        }
        return times;
    }

    private static long[] testRandomSort() {
        long[] times = new long[nArray.length];

        for (int i = 0; i < nArray.length; i++) {
            int[] array = ArrayUtil.fillRandom(nArray[i]);

            long start = System.currentTimeMillis();
            Sorter.bubbleSort(array);
            long result = System.currentTimeMillis() - start;

            System.out.println("RandomSort: length = " + array.length + " time = " + result + " millis");
            times[i] = result;
        }
        return times;
    }

    private static long[] testAlmostSort() {
        long[] times = new long[nArray.length];

        for (int i = 0; i < nArray.length; i++) {
            int[] array = ArrayUtil.fillAlmostSorted(nArray[i]);

            long start = System.currentTimeMillis();
            Sorter.bubbleSort(array);
            long result = System.currentTimeMillis() - start;

            System.out.println("AlmostSort: length = " + array.length + " time = " + result + " millis");
            times[i] = result;
        }
        return times;
    }

}
