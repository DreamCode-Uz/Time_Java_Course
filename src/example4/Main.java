package example4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        int friday = 0;

        System.out.print("Yilni kiriting: ");
        int year = scanner.nextInt();
        calendar.set(year, 0, 1);
        while (friday < 10) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                friday++;
            }
            calendar.add(Calendar.DATE, 1);
        }
        System.out.println(calendar.get(Calendar.YEAR) + ":" + (calendar.get(Calendar.MONTH) + 1) + ":" + (calendar.get(Calendar.DATE) -1));
    }
}
/*Yil berilsa, ushbu yilning 10- jumasi qaysi sanaga to’g’ri kelishini aniqlovchi dastur tuzing.*/