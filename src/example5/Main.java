package example5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        int workday = 0, weekDays = 0, year = 2019, holiday = 6;
        Calendar calendar = new GregorianCalendar();
        System.out.print("Yilni kiriting: ");
        calendar.set(year, 0, 1);
        while (calendar.get(Calendar.YEAR) == year) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                weekDays++;
            } else {
                workday++;
            }
            calendar.add(Calendar.DATE, 1);
        }
//        workday -
        System.out.println("Ish kuni: " + workday + "\nDam olish kuni: " + weekDays);
    }}
// 31-Dekabr;
// 14 -Yanvar;
// 8-Mart;
// 9-May;
// 1-Sentabr;
// 8-Dekabr;
// Asosan 6 ta bayram dam olish kuni hisoblanadi;

//O’zbekistondagi bayram kunlarini hisobga olgan holda 2019 yilda nechta ish kuni bo’lganligini hisoblaydigan dastur tuzing.
// Shanba, yakshanba va bayram kunlari dam olish kuni hisoblanadi.
