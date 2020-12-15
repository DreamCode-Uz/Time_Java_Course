package online.uz.pdp;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Joriy mavjud sana:\t" + calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 20);
        System.out.println("20 kundan keyin:\t" + calendar.getTime());
    }
}
/*Joriy sanadan 20 ish kunidan keyingi kun qaysi sana ekanligini aniqlovchi dastur tuzing.*/