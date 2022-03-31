/**
 * ISD13
 * Nazar Horshevikov
 * 31.03.2022
 */
package dataStructures.lesson3;

import dataStructures.StdDraw;

import java.awt.*;
import java.util.Arrays;

public class DisplayGraphWithTime {

    private static final int ARRAY_LENGTH = 100_000;
    private static final int MAX_TIME_TO_DRAW_IT = 200_000;
    private static final int BORDER = (int) Math.round(ARRAY_LENGTH * 0.1) + 4; //for long array length

    private static final int X_MIN = -BORDER;
    private static final int Y_MIN = -BORDER;
    private static final int X_MAX = ARRAY_LENGTH + BORDER;
    private static final int Y_MAX = MAX_TIME_TO_DRAW_IT + BORDER;

    private static volatile long[][] pointsXY1;
    private static volatile long[][] pointsXY2;
    private static volatile long[][] pointsXY3;
    private static volatile long[][] pointsXY4;

    private static final int[] array = new int[ARRAY_LENGTH];

    static {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        StdDraw.setXscale(X_MIN, X_MAX);
        StdDraw.setYscale(Y_MIN, Y_MAX);
        printCoordinateLines();
    }

    public static void main(String[] args) throws InterruptedException {
        //choose one what you want

        runInFewThreads();
//        runInSingleThread();
    }

    private static void runInSingleThread() {
        pointsXY1 = linearSearch1();
        pointsXY2 = linearSearch2();
        pointsXY3 = linearSearch3();
        pointsXY4 = binarySearch();
        run();
    }

    private static void runInFewThreads() throws InterruptedException {
        Thread t1 = new Thread(() -> pointsXY1 = linearSearch1());
        Thread t2 = new Thread(() -> pointsXY2 = linearSearch2());
        Thread t3 = new Thread(() -> pointsXY3 = linearSearch3());
        Thread t4 = new Thread(() -> pointsXY4 = binarySearch());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        run();
    }

    private static void run() {
        printGraph(pointsXY1, Color.RED);
        printGraph(pointsXY2, Color.BLUE);
        printGraph(pointsXY3, Color.GREEN);
        printGraph(pointsXY4, Color.YELLOW);

        System.out.println("Complete");
    }

    private static void printGraph(long[][] pointsXY, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(0.008);

        for (int i = 0; i < pointsXY[0].length; i++) {
            StdDraw.point(pointsXY[0][i], pointsXY[1][i]);
        }
    }

    private static void printCoordinateLines() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.001);
        StdDraw.setFont(new Font("Arial", Font.PLAIN, 10));

        final int lineIndent = (int) Math.round(ARRAY_LENGTH * 0.04) + 1;

        final int arrayHalf = ARRAY_LENGTH / 2;
        final double timeHalf = Math.round(((Y_MAX - Y_MAX * 0.01) / 2) / 1000) * 1000; //round to thousandth
        final double timeMax = Math.round((Y_MAX - Y_MAX * 0.01) / 1000) * 1000; //round to thousandth

        StdDraw.line(-lineIndent, 0, X_MAX - 1, 0);
        StdDraw.line(0, -lineIndent, 0, Y_MAX - 1);

        StdDraw.text(-lineIndent, -lineIndent, "0");

        //Oy
        StdDraw.text(-lineIndent, 1, "1");
        StdDraw.text(-lineIndent, timeHalf, Double.toString(timeHalf));
        StdDraw.text(-lineIndent, timeMax, Double.toString(timeMax));

        //Ox
        StdDraw.text(1, -lineIndent, "1");
        StdDraw.text(arrayHalf, -lineIndent, Integer.toString(arrayHalf));
        StdDraw.text(ARRAY_LENGTH, -lineIndent, Integer.toString(ARRAY_LENGTH));
    }

    private static long[][] linearSearch1() {
        long[][] pointXY = new long[2][ARRAY_LENGTH];

        long time;
        for (int i = 0; i < array.length; i++) {
            pointXY[0][i] = i;

            int searchEl = array[i];
            long start = System.nanoTime();

            for (int el : array) {
                if (el == searchEl) {
                    System.out.println("linearSearch1: Element " + searchEl + " was found.");
                }
            }
            time = System.nanoTime() - start;
            pointXY[1][i] = time;
        }
        return pointXY;
    }

    private static long[][] linearSearch2() {
        long[][] pointXY = new long[2][array.length];

        long time = 0;
        for (int i = 0; i < array.length; i++) {
            pointXY[0][i] = i;

            int searchEl = array[i];
            long start = System.nanoTime();

            for (int el : array) {
                if (el == searchEl) {
                    time = System.nanoTime() - start;
                    System.out.println("linearSearch2: Element " + searchEl + " was found. Runtime: " + time + " nanos");
                    break;
                }
            }
            pointXY[1][i] = time;
        }
        return pointXY;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private static long[][] linearSearch3() {
        long[][] pointXY = new long[2][array.length];

        long time = 0;
        for (int i = 0; i < array.length; i++) {
            pointXY[0][i] = i;

            int searchEl = array[i];

            long start = System.nanoTime();
            int j;
            for (j = 0; array[j] != searchEl; j++) ;

            if (j < array.length - 1 || array[array.length - 1] == searchEl) {
                time = System.nanoTime() - start;
                System.out.println("linearSearch3: Element " + searchEl + " was found. Runtime: " + time + " nanos");
            }
            pointXY[1][i] = time;
        }
        return pointXY;
    }

    private static long[][] binarySearch() {
        long[][] pointXY = new long[2][array.length];

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        long time = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            pointXY[0][i] = i;

            int searchEl = sortedArray[i];

            Arrays.sort(array);
            long start = System.nanoTime();

            int low = 0;
            int high = array.length;

            while (low <= high) {
                int mid = low + ((high - low) / 2);
                if (array[mid] < searchEl) {
                    low = mid + 1;
                } else if (array[mid] > searchEl) {
                    high = mid - 1;
                } else { //array[mid] == key
                    time = System.nanoTime() - start;
                    System.out.println("binarySearch: Element " + searchEl + " was found. Runtime: " + time + " nanos");
                    break;
                }
            }
            pointXY[1][i] = time;
        }
        return pointXY;
    }
}
