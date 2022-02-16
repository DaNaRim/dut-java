package sem1.lesson3.practise1;

public class ConditionOperations {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        System.out.println(a > b);
        System.out.println(a < b);
        boolean res = a == b;
        System.out.println(res);

        int c = 25;
        res = c >= a && c <= b;
        System.out.println("c belongs to interval of [" + a + "," + b + "]: " + res);
    }
}
