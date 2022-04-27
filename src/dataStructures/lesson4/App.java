package dataStructures.lesson4;

public class App {
    public static void main(String[] args) {
        OrderedArray a = new OrderedArray(70);

        System.out.println(a.delete(42));
//        a.display();

        a.binaryInsert(45);
//        a.display();

        a.binaryInsert(6);
//        a.display();

        a.binaryInsert(89);
//        a.display();

        a.binaryInsert(1);
//        a.display();

        a.binaryInsert(37);
        a.binaryInsert(38);
        a.binaryInsert(12);
        a.binaryInsert(2);
        a.binaryInsert(36);
        a.binaryInsert(2);
        a.binaryInsert(123);
        a.binaryInsert(22);
        a.binaryInsert(32);
        a.binaryInsert(33);
//        a.display();

        System.out.println(a.binaryDelete(37));
//        a.display();

        System.out.println(a.binaryDelete(1));
//        a.display();

        System.out.println(a.binaryDelete(89));
//        a.display();

        System.out.println(a.binaryDelete(42));
//        a.display();

    }
}
