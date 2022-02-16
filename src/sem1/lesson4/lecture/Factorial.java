package sem1.lesson4.lecture;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.print(i + "! = ");
            BigInteger factorial = new BigInteger(Integer.toString(i));
            for (long j = i - 1; j > 1; j--) {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }
            System.out.println(factorial);
        }
    }
}
