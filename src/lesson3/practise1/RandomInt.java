package lesson3.practise1;

public class RandomInt {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        // a pseudo-random real between 0.0 and 1.0
        double r = Math.random();
        // a pseudo-random integer between 0 and n-1
        int value = (int) (r * n);
        System.out.println(value);
    }
}
