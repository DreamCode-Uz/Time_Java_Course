package example1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();

        System.out.print("Yilni kiriting: ");
        int year = scanner.nextInt();
//        Calendar classidan foydalangan holda kabisa yilini hosil qilish;
        calendar.add(Calendar.YEAR, -Calendar.YEAR);
        calendar.add(Calendar.YEAR, year);

        if ((year & 3) == 0 && (year % 25) != 0 || (year & 15) == 0) {
            System.out.println("Kiritilgan yil Kabisa yili.");
        } else {
            System.out.println("Kiritilgan yil Kabisa yili emas.");
        }
    }
}
//1-vazifa

//        Calendar classidan foydalangan holda berilgan yilning kabisa yili yoki
//        kabisa yili emasligini aniqlovchi dastur tuzing