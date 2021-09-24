package lesson2.lecture;

public class RandomNumbersGauss {

    public static void main(String[] args) {

        double random = Math.sin(2 * Math.PI * Math.random()) * Math.pow((-2 * Math.log10(Math.random())), 0.5);
        System.out.println(random);
    }
}
