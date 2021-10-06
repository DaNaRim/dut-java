package lesson3.practise1;

public class Triangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse: " + c);
        System.out.println("Perimeter: " + (a + b + c));
        System.out.println("Area: " + (a * b * 0.5));

        if (a > b) {
            System.out.println("Horizontal orientation");
        } else if (a > b) {
            System.out.println("Vertical orientation");
        } else {
            System.out.println("No orientation");
        }
    }
}
