package lesson3.practise1;

public class DisplayTime {

    public static void main(String[] args) {
        int time = Integer.parseInt(args[0]);

        System.out.println(time + " seconds is " + time / 60 + " minutes and " + time % 60 + " seconds");
//        System.out.printf("%d seconds is %d minutes and %d seconds%n", time, time / 60, time % 60);
    }
}
