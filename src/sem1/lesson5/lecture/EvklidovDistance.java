package sem1.lesson5.lecture;

public class EvklidovDistance {

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {4, 5};

        double distance = Math.sqrt(Math.pow(b[0] - a[0], 2) + Math.pow(b[1] - a[1], 2));
        System.out.println(distance);
    }
}
