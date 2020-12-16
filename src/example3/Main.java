// Author: Dilshodbek Fayzullayev;
// Date: 16:02:2020;

package example3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workday = 0, weekDays = 0, year;
        Calendar calendar = new GregorianCalendar();
        System.out.print("Yilni kiriting: ");
        year = scanner.nextInt();
        calendar.set(year, 0, 1);
        while (calendar.get(Calendar.YEAR) == year) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                weekDays++;
            } else {
                workday++;
            }
            calendar.add(Calendar.DATE, 1);
        }
        System.out.println("Ish kuni: " + workday + "\nDam olish kuni: " + weekDays);
    }
}
//    Berilgan yilda nechta ish kuni va nechta dam olish kunlari borligini aniqlovchi dastur tuzing.
//    Shanba va Yakshanba dam olish kuni hisoblanadi.
