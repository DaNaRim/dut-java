/**
 * Created by Nazar Horshevikov
 * ISD - 13
 * https://github.com/DaNaRim/dut-java
 */

package sem1.lesson2.lecture;

public class RandomNumbersGauss {

    public static void main(String[] args) {

        double random = Math.sin(2 * Math.PI * Math.random()) * Math.pow((-2 * Math.log10(Math.random())), 0.5);
        System.out.println(random);
    }
}
