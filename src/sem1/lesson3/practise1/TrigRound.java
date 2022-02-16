package sem1.lesson3.practise1;

public class TrigRound {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        double sinX = Math.sin(Math.toRadians(x));
        double cosX = Math.cos(Math.toRadians(x));
        double tanX = Math.tan(Math.toRadians(x));

        System.out.println(((int) (sinX * 100)) / 100.0);
        System.out.println(((int) (sinX * 1000)) / 1000.0);
        System.out.println(((int) (sinX * 10000)) / 10000.0);

        System.out.println(((int) (cosX * 100)) / 100.0);
        System.out.println(((int) (cosX * 1000)) / 1000.0);
        System.out.println(((int) (cosX * 10000)) / 10000.0);

        System.out.println(((int) (tanX * 100)) / 100.0);
        System.out.println(((int) (tanX * 1000)) / 1000.0);
        System.out.println(((int) (tanX * 10000)) / 10000.0);

        System.out.println(((int) (sinX / cosX * 100)) / 100.0);
        System.out.println(((int) (sinX / cosX * 1000)) / 1000.0);
        System.out.println(((int) (sinX / cosX * 10000)) / 10000.0);

        System.out.println(((int) ((sinX * sinX + cosX * cosX) * 100)) / 100.0);
        System.out.println(((int) ((sinX * sinX + cosX * cosX) * 1000)) / 1000.0);
        System.out.println(((int) ((sinX * sinX + cosX * cosX) * 10000)) / 10000.0);


        int round = Integer.parseInt(args[1]);
        double roundUp = Math.pow(10, round);

        System.out.println(((int) (sinX * roundUp)) / roundUp);
        System.out.println(((int) (cosX * roundUp)) / roundUp);
        System.out.println(((int) (tanX * roundUp)) / roundUp);
        System.out.println(((int) (sinX / cosX * roundUp)) / roundUp);
        System.out.println(((int) ((sinX * sinX + cosX * cosX) * roundUp)) / roundUp);
    }
}
