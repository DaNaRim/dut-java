import java.util.Arrays;
import java.util.HashSet;

public class Bodya {

    public static void main(String[] args) {
        int result = 0;
        for (int i4 = 1; i4 < 6; i4++) {
            for (int i3 = 0; i3 < 6; i3++) {
                for (int i2 = 0; i2 < 6; i2++) {
                    for (int i1 = 0; i1 < 6; i1++) {
                        Integer[] array = {i1, i2, i3, i4};
                        int uniqueLength = (new HashSet<>(Arrays.asList(array)).toArray(new Integer[0])).length;
                        if (uniqueLength == 4) {
                            int num = i1 + i2 * 10 + i3 * 100 + i4 * 1000;
                            if (Integer.toString(num).contains("3")) {
                                System.out.println(num);
                                result++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("result = " + result);
    }
}
