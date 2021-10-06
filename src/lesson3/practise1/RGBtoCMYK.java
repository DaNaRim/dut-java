package lesson3.practise1;

public class RGBtoCMYK {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if (r + g + b == 0) {
            System.out.println("0.0");
            System.out.println("0.0");
            System.out.println("0.0");
            System.out.println("1.0");
        } else {
            double w = Math.max(Math.max((double) r / 255, (double) g / 255), (double) b / 255);
            double c = (w - (double) r / 255) / w;
            double m = (w - (double) g / 255) / w;
            double y = (w - (double) b / 255) / w;
            double k = 1 - w;

            System.out.println(c);
            System.out.println(m);
            System.out.println(y);
            System.out.println(k);
        }
    }
}
