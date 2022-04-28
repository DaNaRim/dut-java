package dataStructures.lesson5;

import dataStructures.StdDraw;

import java.awt.*;
import java.util.Arrays;

public class Demo {

    private static final long[] nArray = {1000, 10_000, 100_000, 1_000_000, 3_000_000, 5_000_000,
            7_000_000, 10_000_000, 15_000_000, 20_000_000, 25_000_000};

    public static void main(String[] args) throws InterruptedException {

        runForLoop();
        runDoubleForLoop();
        Thread.sleep(4000);

        runForLoopWithVariableLimits();
        Thread.sleep(4000);

        runForLoopWithVariableLimits2();
        runDoubleForLoopWithPermanentLoop();
        runDoubleForLoopWithVariableLoop();

        System.out.println("Complete");
    }

    public static void runForLoop() {
        final long[] times = testForLoop();
        printGraph(nArray, times, Color.RED);
    }

    public static void runDoubleForLoop() {
        final long[] copiedArray = Arrays.stream(nArray).map(i -> i / 1000).toArray();

        final long[] times = testDoubleForLoop(copiedArray);
        printGraph(copiedArray, times, Color.BLUE);
    }

    public static void runForLoopWithVariableLimits() {
        final long[] times = testForLoopWithVariableLimits();
        printGraph(nArray, times, Color.GREEN);
    }

    public static void runForLoopWithVariableLimits2() {
        final long[] times = testForLoopWithVariableLimits2();
        printGraph(nArray, times, Color.CYAN);
    }

    public static void runDoubleForLoopWithPermanentLoop() {
        final long[] copiedArray = Arrays.stream(nArray).map(i -> i / 1000).toArray();

        final long[] times = testDoubleForLoopWithPermanentLoop(copiedArray);
        printGraph(copiedArray, times, Color.MAGENTA);
    }

    public static void runDoubleForLoopWithVariableLoop() {
        final long[] copiedArray = Arrays.stream(nArray).map(i -> i / 1000).toArray();

        final long[] times = testDoubleForLoopWithVariableLoop(copiedArray);
        printGraph(copiedArray, times, Color.ORANGE);
    }

    private static long[] testForLoop() {
        StopWatch sw = new StopWatch();

        long[] timeArr = new long[nArray.length];

        for (int i = 0; i < nArray.length; i++) {
            long n = nArray[i];

            sw.start();
            for (int j = 0; j < n; j++) {
                int a = (int) (Math.random() * 10);
                int b = (int) (Math.random() * 10);
            }
            sw.stop();
            System.out.println("testForLoop: n = " + nArray[i] + " time = " + sw.getTime() + " millis");
            timeArr[i] = sw.getTime();
        }
        return timeArr;
    }

    private static long[] testDoubleForLoop(long[] array) {
        StopWatch sw = new StopWatch();

        long[] timeArr = new long[array.length];

        for (int i = 0; i < array.length; i++) {
            long n = array[i];

            sw.start();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int a = (int) (Math.random() * 10);
                    int b = (int) (Math.random() * 10);
                }
            }
            sw.stop();
            System.out.println("testDoubleForLoop: n = " + n + " time = " + sw.getTime() + " millis");

            timeArr[i] = sw.getTime();
        }
        return timeArr;
    }

    private static long[] testForLoopWithVariableLimits() {
        StopWatch sw = new StopWatch();

        long[] timeArr = new long[nArray.length];

        for (int i = 0; i < nArray.length; i++) {
            long n = nArray[i];

            sw.start();
            for (long j = n; j > 0; j /= 2) {
                int a = (int) (Math.random() * 10);
                int b = (int) (Math.random() * 10);
            }
            sw.stop();
            System.out.println("testForLoopWithVariableLimits: n = " + n + " time = " + sw.getTime() + " nanos");

            timeArr[i] = sw.getTime();
        }
        return timeArr;
    }

    private static long[] testForLoopWithVariableLimits2() {
        StopWatch sw = new StopWatch();

        long[] timeArr = new long[nArray.length];

        for (int i = 0; i < nArray.length; i++) {
            long n = nArray[i];

            sw.start();
            for (long j = 1; j <= n; j *= 2) {
                int a = (int) (Math.random() * 10);
                int b = (int) (Math.random() * 10);
            }
            sw.stop();
            System.out.println("testForLoopWithVariableLimits2: n = " + n + " time = " + sw.getTime() + " nanos");

            timeArr[i] = sw.getTime();
        }
        return timeArr;
    }

    private static long[] testDoubleForLoopWithPermanentLoop(long[] array) {
        StopWatch sw = new StopWatch();

        long[] timeArr = new long[array.length];

        for (int i = 0; i < array.length; i++) {
            long n = array[i];

            sw.start();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 10_000; k++) {
                    int a = (int) (Math.random() * 10);
                    int b = (int) (Math.random() * 10);
                }
            }
            sw.stop();
            System.out.println("testDoubleForLoopWithPermanentLoop: n = " + n + " time = " + sw.getTime() + " millis");

            timeArr[i] = sw.getTime();
        }
        return timeArr;
    }

    private static long[] testDoubleForLoopWithVariableLoop(long[] array) {
        StopWatch sw = new StopWatch();

        long[] timeArr = new long[array.length];

        for (int i = 0; i < array.length; i++) {
            long n = array[i];

            sw.start();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    int a = (int) (Math.random() * 10);
                    int b = (int) (Math.random() * 10);
                }
            }
            sw.stop();
            System.out.println("estDoubleForLoopWithVariableLoop: n = " + n + " time = " + sw.getTime() + " millis");

            timeArr[i] = sw.getTime();
        }
        return timeArr;
    }

    private static void printGraph(long[] nArr, long[] timeArr, Color color) {
        StdDraw.clear();
        prepareBoard(timeArr, nArr);

        StdDraw.setPenRadius(0.008);
        StdDraw.setPenColor(color);

        for (int i = 0; i < timeArr.length; i++) {
            if (timeArr[i] == 0) continue;
            StdDraw.point(nArr[i], timeArr[i]);
        }
    }

    private static void prepareBoard(long[] times, long[] arr) {
        final long maxTime = Arrays.stream(times).max().getAsLong();
        final long maxN = Arrays.stream(arr).max().getAsLong();

        final long borderX = Math.round(maxN * 0.15);
        final long borderY = Math.round(maxTime * 0.1);

        StdDraw.setXscale(-borderX, maxN + borderX);
        StdDraw.setYscale(-borderY, maxTime + borderY);

        printCoordinateLines(maxN, maxTime);
    }

    private static void printCoordinateLines(long arrayLength, long maxTime) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.001);
        StdDraw.setFont(new Font("Arial", Font.PLAIN, 10));

        final int lineIndentOy = (int) Math.round(arrayLength * 0.04) + 1;
        final int lineIndentOx = (int) Math.round(maxTime * 0.04) + 1;

        final long arrayHalf = arrayLength / 2;
        final long timeHalf = Math.round(((maxTime - maxTime * 0.01) / 2) / 100) * 100; //round to hundreds
        final long timeMax = Math.round((maxTime - maxTime * 0.01) / 100) * 100; //round to hundreds

        StdDraw.line(-lineIndentOy, 0, arrayLength, 0); //Ox
        StdDraw.line(0, -lineIndentOx, 0, maxTime); //Oy

        StdDraw.text(-lineIndentOy, -lineIndentOx, "0");

        //Oy
        StdDraw.text(-lineIndentOy, 1, "1");
        StdDraw.text(-lineIndentOy, timeHalf, Long.toString(timeHalf));
        StdDraw.text(-lineIndentOy, timeMax, Long.toString(timeMax));

        //Ox
        StdDraw.text(1, -lineIndentOx, "1");
        StdDraw.text(arrayHalf, -lineIndentOx, Long.toString(arrayHalf));
        StdDraw.text(arrayLength, -lineIndentOx, Long.toString(arrayLength));

        String methodName = Thread.currentThread()
                .getStackTrace()[4]
                .getMethodName()
                .replaceFirst("run", "");

        StdDraw.setFont(new Font("Arial", Font.PLAIN, 20));
        StdDraw.text(arrayHalf, timeMax + lineIndentOx * 2L, methodName);
    }

}
