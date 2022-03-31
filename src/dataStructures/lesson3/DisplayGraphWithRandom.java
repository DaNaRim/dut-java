/**
 * ISD13
 * Nazar Horshevikov
 * 31.03.2022
 */
package dataStructures.lesson3;

import dataStructures.StdDraw;

import java.awt.*;
import java.util.Arrays;

public class DisplayGraphWithRandom {

    private static final int ARRAY_LENGTH = 10_000;
    private static final int BORDER = (int) Math.round(ARRAY_LENGTH * 0.1) + 4; //for long array length

    private static final int X_MIN = -BORDER;
    private static final int Y_MIN = -BORDER;
    private static final int X_MAX = ARRAY_LENGTH + BORDER;
    private static final int Y_MAX = ARRAY_LENGTH + BORDER;

    private static final int[] array = new int[ARRAY_LENGTH];

    static {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * array.length);
        }
        StdDraw.setXscale(X_MIN, X_MAX);
        StdDraw.setYscale(Y_MIN, Y_MAX);
        printCoordinateLines();
    }

    public static void main(String[] args) {
        printGraph(linearSearch1(), Color.RED);
        printGraph(linearSearch2(), Color.BLUE);
        printGraph(linearSearch3(), Color.GREEN);
    }

    private static void printGraph(int[][] pointXY, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(0.008);

        for (int i = 0; i < pointXY[0].length; i++) {
            StdDraw.point(pointXY[0][i], pointXY[1][i]);
        }
    }

    private static void printCoordinateLines() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.001);
        StdDraw.setFont(new Font("Arial", Font.PLAIN, 10));

        final int lineIndent = (int) Math.round(ARRAY_LENGTH * 0.03) + 1;
        final int arrayHalf = ARRAY_LENGTH / 2;
        final String textArrayHalf = Integer.toString(arrayHalf);

        StdDraw.line(-lineIndent, 0, X_MAX - 1, 0);
        StdDraw.line(0, -lineIndent, 0, Y_MAX - 1);

        StdDraw.text(-lineIndent, -lineIndent, "0");

        //Oy
        StdDraw.text(-lineIndent, lineIndent, "1");
        StdDraw.text(-lineIndent, arrayHalf, textArrayHalf);
        StdDraw.text(-lineIndent, ARRAY_LENGTH, Integer.toString(ARRAY_LENGTH));

        //Ox
        StdDraw.text(lineIndent, -lineIndent, "1");
        StdDraw.text(arrayHalf, -lineIndent, textArrayHalf);
        StdDraw.text(ARRAY_LENGTH - 1, -lineIndent, Integer.toString(ARRAY_LENGTH - 1));
    }

    private static int[][] linearSearch1() {
        int[][] pointXY = new int[2][array.length];

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        for (int i = 0; i < sortedArray.length; i++) {
            pointXY[0][i] = i;

            int searchEl = sortedArray[i];
            int counter = 0;
            for (int el : array) {
                counter++;
                if (el == searchEl) {
                    System.out.println("linearSearch1: Element " + searchEl + " was found");
                }
            }
            pointXY[1][i] = counter;
            System.out.println("linearSearch1: Number of comparisons is " + counter);
        }
        return pointXY;
    }

    private static int[][] linearSearch2() {
        int[][] pointXY = new int[2][array.length];

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        for (int i = 0; i < sortedArray.length; i++) {
            pointXY[0][i] = i;

            int searchEl = sortedArray[i];
            int counter = 0;
            for (int el : array) {
                counter++;
                if (el == searchEl) {
                    System.out.println("linearSearch2: Element " + searchEl + " was found. Number of comparisons is " + counter);
                    break;
                }
            }
            pointXY[1][i] = counter;
        }
        return pointXY;
    }

    private static int[][] linearSearch3() {
        int[][] pointXY = new int[2][array.length];

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        for (int i = 0; i < sortedArray.length; i++) {
            pointXY[0][i] = i;

            int searchEl = sortedArray[i];

            int counter = 0;
            int j;
            for (j = 0; array[j] != searchEl; j++) {
                counter++;
            }
            if (j < array.length - 1 || array[array.length - 1] == searchEl) {
                System.out.println("linearSearch3: Element " + searchEl + " was found. Number of comparisons is " + counter);
            }

            pointXY[1][i] = counter;
        }
        return pointXY;
    }

}