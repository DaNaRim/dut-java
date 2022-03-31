package dataStructures.lesson2;

public class LinearSearch {

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        displayArray(a);

//        int x = 78;
//        int answer = -1;
//        int counter = 0;
//        for (int i = 0; i < a.length; i++) {
//            counter++;
//            if (a[i] == x) {
//                answer = i;
//                System.out.println("element " + x + " was found at index " + i);
//                break;
//            }
//        }

        int x = 78;
        int answer = -1;
        int counter = 0;
        int last = a[a.length - 1];
        a[a.length - 1] = x;
        int j = 0;
        while (a[j] != x) {
            j++;
            counter++;
        }
        a[a.length - 1] = last;
        if (j < a.length - 1 || a[a.length - 1] == x) {
            System.out.println("element " + x + " was found at " + j + " index");
        }


        for (int i = 0; i < a.length; i++) {
            counter++;
            if (a[i] == x) {
                answer = i;
                System.out.println("element " + x + " was found at index " + i);
                break;
            }
        }

        System.out.println("answer " + answer);
        System.out.println("number of comparisons " + counter);
    }

    public static void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + i + ":" + a[i] + "] ");
        }
        System.out.println();
    }
}
