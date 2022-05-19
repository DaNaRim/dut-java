package dataStructures.lesson6.version2;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo {

    private static final int[] nArray = {10_000, 25_000, 50_000, 75_000, 100_000, 125_000,
            150_000, 175_000, 200_000, 225_000};

    private static long[] times1;
    private static long[] times2;
    private static long[] times3;

    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread(() -> times1 = testSort(new RandomFiller(), new BubbleSorter()));
        Thread t1 = new Thread(() -> times2 = testSort(new RandomFiller(), new SelectorSorter()));
        Thread t3 = new Thread(() -> times3 = testSort(new RandomFiller(), new InsertionSorter()));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        long maxTime = Stream.of(
                Arrays.stream(times1).max().getAsLong(),
                Arrays.stream(times2).max().getAsLong(),
                Arrays.stream(times3).max().getAsLong()
        ).max(Long::compare).get();

        Artist.prepareBoard(nArray, maxTime, " ");

        printTable(times1, "Bubble");
        printTable(times2, "Selector");
        printTable(times3, "Insertion");

        Artist.printGraph(nArray, times1, Color.RED);
        Artist.printGraph(nArray, times2, Color.GREEN);
        Artist.printGraph(nArray, times3, Color.BLUE);

        System.out.println("Complete!");
    }

    private static void printTable(long[] times, String tableName) {
        System.out.printf("%n%s%n%-3s %-7s %-5s%n", tableName, "", "N", "t(N)");
        for (int i = 0; i < nArray.length; i++) {
            System.out.printf("%-3d %-7s %-5s%n", i + 1, getNumWithUnderScope(nArray[i]), times[i]);
        }
    }

    private static String getNumWithUnderScope(int number) {
        String num = String.valueOf(number);
        num = num.substring(0, num.length() - 3) + "_" + num.substring(num.length() - 3);
        return num;
    }

    private static long[] testSort(ArrayFiller filler, Sorter sorter) {
        long[] times = new long[nArray.length];

        for (int i = 0; i < nArray.length; i++) {
            int[] array = filler.fill(nArray[i]);

            long start = System.currentTimeMillis();
            sorter.sort(array);
            long result = System.currentTimeMillis() - start;

            System.out.printf("%-12s %-10s: length = %-7s time = %d millis%n",
                    filler.getClass().getSimpleName().replace("Filler", ""),
                    sorter.getClass().getSimpleName().replace("Sorter", ""),
                    getNumWithUnderScope(array.length), result);
            times[i] = result;
        }
        return times;
    }

}
