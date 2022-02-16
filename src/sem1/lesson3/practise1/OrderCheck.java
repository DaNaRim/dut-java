package sem1.lesson3.practise1;

public class OrderCheck {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if (x < y && y < z) {
            System.out.println("sorted asc");
        } else if (x > y && y > z) {
            System.out.println("sorted desc");
        } else {
            System.out.println("no order");
        }
    }
}
