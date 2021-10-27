package lesson4.lecture;

public class PowersOfTwo {

    public static void main(String[] args) {

        int width = 10;

        System.out.println("*********************");
        System.out.printf("%-" + width + "s", "* n,");
        System.out.printf("%-" + width + "s", "2^n");
        System.out.printf("%-" + width + "s%n", "*");
        System.out.println("*********************");

        for (int i = 0; i < 11; i++) {
            System.out.printf("%-" + width + "s", "* " + i + ", ");
            System.out.printf("%-" + width + "d", (int) Math.pow(2, i));
            System.out.printf("%-" + width + "s%n", "*");
        }
        System.out.println("*********************");
    }
}
