package lesson4.lecture;

public class RollDice {

    public static void main(String[] args) {
        double chance = Math.random();
        System.out.println(chance);
        if (chance <= (double) 1 / 6) {
            System.out.println(1);

        } else if (chance <= (double) 2 / 6) {
            System.out.println(2);

        } else if (chance <= (double) 3 / 6) {
            System.out.println(3);

        } else if (chance <= (double) 4 / 6) {
            System.out.println(4);

        } else if (chance <= (double) 5 / 6) {
            System.out.println(5);

        } else {
            System.out.println(6);
        }
    }
}
