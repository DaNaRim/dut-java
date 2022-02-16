package sem1.lesson3.practise1;

public class Trig {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        double sinX = Math.sin(Math.toRadians(x));
        double cosX = Math.cos(Math.toRadians(x));
        double tanX = Math.tan(Math.toRadians(x));


        System.out.println(sinX);
        System.out.println(cosX);
        System.out.println(tanX);
        System.out.println(sinX / cosX);
        System.out.println(sinX * sinX + cosX * cosX);
    }
}
