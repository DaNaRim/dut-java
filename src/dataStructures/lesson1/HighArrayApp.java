/**
 * ISD13
 * Nazar Horshevikov
 * 17.02.2022
 */
package dataStructures.lesson1;

public class HighArrayApp {
    public static void main(String[] args) {
        HighArray arr = new HighArray(50);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.printArray();
        arr.find(77);
        arr.delete(33);
        arr.printArray();
    }
}
