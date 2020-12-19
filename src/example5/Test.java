package example5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        int workDays = 0, weekdays = 0;
        Calendar calendar = new GregorianCalendar();
        calendar.set(2019,0,1);
        while(calendar.get(Calendar.YEAR) == 2019) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || (calendar.get(Calendar.DAY_OF_MONTH) == Calendar.DECEMBER && calendar.get(Calendar.DATE) == 8 || calendar.get(Calendar.DATE) == 31) || (calendar.get(Calendar.DAY_OF_MONTH) == Calendar.SEPTEMBER && calendar.get(Calendar.DATE) == 1) || (calendar.get(Calendar.DAY_OF_MONTH) == Calendar.MAY && calendar.get(Calendar.DATE) == 9) || (calendar.get(Calendar.DAY_OF_MONTH) == Calendar.JANUARY && calendar.get(Calendar.DATE) == 1)) {
                weekdays++;
            } else {
                workDays++;
            }
            calendar.add(Calendar.DATE, 1);
        }
        System.out.println("Ish kunlari: " + workDays + "\nDam olish kunlari: " + weekdays);
    }
}
/*
 31-Dekabr;
 9-May;
 1-Sentabr;
 8-Dekabr;
 1- Yanvar
 umum dam olish kuni hisoblanadi;

O’zbekistondagi bayram kunlarini hisobga olgan holda 2019 yilda nechta ish kuni bo’lganligini hisoblaydigan dastur tuzing.
 Shanba, yakshanba va bayram kunlari dam olish kuni hisoblanadi.
261 == 104;
* */