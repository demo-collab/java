import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDisplay {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is: " + format1.format(now));

        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is: " + format2.format(now));

        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is: " + format3.format(now));

        SimpleDateFormat format4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is: " + format4.format(now));

        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z");
        System.out.println("Current date and time is: " + format5.format(now));
    }
}