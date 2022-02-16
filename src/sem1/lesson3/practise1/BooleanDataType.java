package sem1.lesson3.practise1;

public class BooleanDataType {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a=" + a + ", b=" + b);

        System.out.println("a=" + a + ", b=" + b + ", result of && operation " + (a && b));

        b = true;
        System.out.println("a=" + a + ", b=" + b + ", result of && operation " + (a && b));
        System.out.println("-----------------------------------");

        a = true;
        b = true;
        System.out.println(
                "a=" + a
                        + ", b=" + b
                        + ", a && b = " + (a && b)
                        + ", a || b = " + (a || b)
                        + ", !a = " + !a);

        a = true;
        b = false;
        System.out.println(
                "a=" + a
                        + ", b=" + b
                        + ", a && b = " + (a && b)
                        + ", a || b = " + (a || b)
                        + ", !a = " + !a);

        a = false;
        b = true;
        System.out.println(
                "a=" + a
                        + ", b=" + b
                        + ", a && b = " + (a && b)
                        + ", a || b = " + (a || b)
                        + ", !a = " + !a);
    }
}