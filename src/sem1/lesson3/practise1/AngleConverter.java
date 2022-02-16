package sem1.lesson3.practise1;

public class AngleConverter {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        double degrees = Math.toDegrees(theta);

        System.out.println("r= " + r);
        System.out.println("theta= " + theta);
        System.out.println("degrees= " + degrees);
    }
}
