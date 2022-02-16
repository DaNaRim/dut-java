package sem1.lesson5.lecture;

import java.util.Arrays;

public class SwappingElements {

    public static void main(String[] args) {

        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8"};
        int len = array.length;

        for (int i = 0; i < len / 2; i++) {
            String temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

//        Collections.reverse(Arrays.asList(array));
//        System.out.println(Arrays.toString(array));
    }
}
