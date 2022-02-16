package sem1.lesson5.lecture;

public class LongestSequence {

    public static void main(String[] args) {
        int[] landscape = {1, 1, 1, 1, 1, 2, 3, 4, 4, 3, 3};
//        int[] landscape = {1, 1, 2, 3, 4, 4, 4, 4, 4, 3, 3};
//        int[] landscape = {1, 1, 2, 3, 4, 4, 3, 3, 3, 3, 3};

        int maxLength = 0;
        int placeMaxLength = 0;

        int currentLength = 1;
        int currentNum = landscape[0];

        for (int i = 1; i < landscape.length; i++) {
            if (landscape[i] == currentNum) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    placeMaxLength = i - currentLength;
                    maxLength = currentLength;
                }
                currentLength = 1;
                currentNum = landscape[i];
            }
            if (currentLength > maxLength && i == landscape.length - 1) {
                placeMaxLength = i - currentLength + 1;
                maxLength = currentLength;
            }
        }
        System.out.println("maxLength = " + maxLength + ", place = " + placeMaxLength);
    }
}
