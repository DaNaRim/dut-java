package sem1.lesson4.lecture;

public class RollLoadedDice {

    public static void main(String[] args) {
        double chance = Math.random();
        System.out.println(chance);
        if (chance <= (double) 1 / 10) {
            System.out.println(1);

        } else if (chance <= (double) 2 / 10) {
            System.out.println(2);

        } else if (chance <= (double) 3 / 10) {
            System.out.println(3);

        } else if (chance <= (double) 4 / 10) {
            System.out.println(4);

        } else if (chance <= (double) 6 / 10) {
            System.out.println(5);

        } else {
            System.out.println(6);
        }
    }
}
