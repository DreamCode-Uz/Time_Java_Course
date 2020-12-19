package online.uz.pdp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
//        Birinchi ko'rinishni date o'zini chopetish bilan ham chiqarish mumkin
        System.out.println(date);

//        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd H:mm");
//        System.out.println(format.format(date.getTime()));

        // Ushbu sana berilgan darsning vazifasiga asosan qilindi yani 2003 -yil, 11-oy, 4 kuniga misol;
        formatDate("E MMM dd HH:mm:ss z yyyy");

        formatDate("MM/dd/yy H:mm");
        formatDate("h:mm:ss a");
        formatDate("MMM d, yyyy h:mm:ss a");
        formatDate("h:mm a");
        formatDate("h:mm:ss a");
        formatDate("h:mm:ss a z");
        formatDate("MM/d/yy h:mm a");
        formatDate("MMM d, yyyy h:mm a");
        formatDate("MMMM d, yyyy h:mm:ss a z");
    }
    public static void formatDate(String format) {
        SimpleDateFormat form = new SimpleDateFormat(format);
        Date date = new Date();
        System.out.println(form.format(date.getTime()));
    }
}
/*Joriy sanani quyidagicha formatlarda ekranga chiqazadigan dastur tuzing:
1. Tue Nov 04 20:14:11 EST 2003
 2. 11/4/03 8:14 PM
 3. 8:14:11 PM
 4. Nov 4, 2003 8:14:11 PM
 5. 8:14 PM
 6. 8:14:11 PM
 7. 8:14:11 PM EST
 8. 11/4/03 8:14 PM
 9. Nov 4, 2003 8:14 PM
10. November 4, 2003 8:14:11 PM EST*/