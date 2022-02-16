package sem1.lesson5.lecture;

import java.util.Arrays;

public class Ex148 {

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println(Arrays.toString(a));
//        [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
    }
}
