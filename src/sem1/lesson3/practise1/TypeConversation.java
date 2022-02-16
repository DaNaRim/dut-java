package sem1.lesson3.practise1;

public class TypeConversation {

    public static void main(String[] args) {

        double t1 = 99.99;
        String text = "temperature is " + t1 + " of C";
        System.out.println(text);

        int x2 = 23;
        double y2 = x2;
        System.out.println(x2 + "," + y2);

        double y3 = 5.045;


        int a = Integer.parseInt("6722");
        long b = Math.round(y3);


        int x4 = (int) y3;
        System.out.println("original number is " + y3 + ",  after casting to int: " + x4);

        int x5 = Integer.MAX_VALUE + 1;
        System.out.println(Integer.MAX_VALUE + ", after adding 1:" + x5);
    }
}
