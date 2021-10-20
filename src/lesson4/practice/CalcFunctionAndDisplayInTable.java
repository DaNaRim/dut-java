package lesson4.practice;

public class CalcFunctionAndDisplayInTable {

    public static void main(String[] args) {

        int width = 16;

        // example: %-16s
        System.out.printf("%-" + width + "s", "n");
        System.out.printf("%-" + width + "s", "log(n)");
        System.out.printf("%-" + width + "s", "n * log(n)");
        System.out.printf("%-" + width + "s", "n ^ 2");
        System.out.printf("%-" + width + "s", "n ^ 3");
        System.out.printf("%-" + width + "s%n", "2 ^ n");

        for (int i = 16; i <= 2048; i *= 2) {
            System.out.printf("%-" + width + "d", i);
            System.out.printf("%-" + width + "f", Math.log(i));
            System.out.printf("%-" + width + "f", i * Math.log(i));
            System.out.printf("%-" + width + "d", i * i);
            System.out.printf("%-" + width + "d", i * i * i);
            System.out.printf("%-" + width + "f%n", Math.pow(2, i));
        }
    }
}
