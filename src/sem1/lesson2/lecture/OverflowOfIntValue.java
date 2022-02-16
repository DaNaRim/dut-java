/**
 * Created by Nazar Horshevikov
 * ISD - 13
 * https://github.com/DaNaRim/dut-java
 */

package sem1.lesson2.lecture;

public class OverflowOfIntValue {

    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        int overflowValue = value + 1000;
        System.out.println(overflowValue);

        /*
        MAX_VALUE + 1 = MIN_VALUE
        it's like a snake that bites it's tail
        0111 1111 1111 1111 1111 1111 1111 1111 + 1 = 1000 0000 0000 0000 0000 0000 0000 0000
         */

        System.out.println();

        int value2 = Integer.MIN_VALUE;
        int overflowValue2 = value2 - 1000;
        System.out.println(overflowValue2);

        /*
        MIN_VALUE - 1 = MAX_VALUE
        it's like a snake that bites it's tail
        1000 0000 0000 0000 0000 0000 0000 0000 - 1 = 0111 1111 1111 1111 1111 1111 1111 1111
         */
    }
}
