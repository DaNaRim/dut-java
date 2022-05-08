package dataStructures.lesson6;

import dataStructures.StdDraw;

import java.awt.*;
import java.util.Arrays;

public class Artist {

    protected static void printGraph(int[] nArr, long[] timeArr, Color color) {
        StdDraw.setPenColor(color);

        for (int i = 0; i < timeArr.length; i++) {
            StdDraw.setPenRadius(0.008);
            StdDraw.point(nArr[i], timeArr[i]);
            StdDraw.setPenRadius(0.001);
            if (i > 0) StdDraw.line(nArr[i - 1], timeArr[i - 1], nArr[i], timeArr[i]);
        }
    }

    protected static void prepareBoard(int[] arr, long maxTime, String graphicName) {
        final long maxN = Arrays.stream(arr).max().getAsInt();

        final long borderX = Math.round(maxN * 0.1);
        final long borderY = Math.round(maxTime * 0.1);

        StdDraw.setXscale(-borderX, maxN + borderX);
        StdDraw.setYscale(-borderY, maxTime + borderY);

        printCoordinateLines(arr, maxTime, graphicName);
    }

    private static void printCoordinateLines(int[] nArray, long maxTime, String graphicName) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.001);
        StdDraw.setFont(new Font("Arial", Font.PLAIN, 10));

        final long maxN = Arrays.stream(nArray).max().getAsInt();

        final int lineIndentOy = (int) Math.round(maxN * 0.05) + 1;
        final int lineIndentOx = (int) Math.round(maxTime * 0.04) + 1;

        final long timeMax = Math.round((maxTime - maxTime * 0.01) / 100) * 100; //round to hundreds
        final long timeHalf = timeMax / 2;
        final long time14 = timeHalf - timeHalf / 2;
        final long time34 = timeHalf + timeHalf / 2;

        final double miniLineCoefficient = 0.2;

        StdDraw.line(-lineIndentOy, 0, maxN, 0); //Ox
        StdDraw.line(0, -lineIndentOx, 0, maxTime); //Oy

        StdDraw.text(-lineIndentOy, -lineIndentOx, "0");

        //Oy
        StdDraw.text(-lineIndentOy, timeHalf, Long.toString(timeHalf));
        StdDraw.text(-lineIndentOy, timeMax, Long.toString(timeMax));
        StdDraw.text(-lineIndentOy, time14, Long.toString(time14));
        StdDraw.text(-lineIndentOy, time34, Long.toString(time34));

        StdDraw.line(lineIndentOy * miniLineCoefficient, timeHalf, -lineIndentOy * miniLineCoefficient, timeHalf);
        StdDraw.line(lineIndentOy * miniLineCoefficient, timeMax, -lineIndentOy * miniLineCoefficient, timeMax);
        StdDraw.line(lineIndentOy * miniLineCoefficient, time14, -lineIndentOy * miniLineCoefficient, time14);
        StdDraw.line(lineIndentOy * miniLineCoefficient, time34, -lineIndentOy * miniLineCoefficient, time34);

        //Ox
        for (long num : nArray) {
            StdDraw.line(num, lineIndentOx * miniLineCoefficient, num, -lineIndentOx * miniLineCoefficient);
            StdDraw.text(num, -lineIndentOx, Long.toString(num));
        }
        StdDraw.setFont(new Font("Arial", Font.PLAIN, 20));
        StdDraw.text(maxN / 2.0, maxTime + lineIndentOx, graphicName);
    }

}
