/**
 * Created by Nazar Horshevikov
 * ISD - 13
 * https://github.com/DaNaRim/dut-java
 */

package sem1.lesson2.lecture;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        System.out.println(d0);

        /* simplification
            int y1 = y - (14 - m) / 12;
            int d1 = (d + (y1 + y1 / 4 - y1 / 100 + y1 / 400) + (31 * (m + 12 * ((14 - m) / 12) - 2)) / 12) % 7;
            System.out.println(d1);
         */

/* it's better
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_MONTH, d);
        calendar.set(Calendar.MONTH, d);
        calendar.set(Calendar.YEAR, d);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
*/
    }
}
