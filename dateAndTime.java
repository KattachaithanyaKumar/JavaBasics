import java.util.Date;
import java.text.*;

public class dateAndTime {
    public static void main(String args[])  {
        //Instance a date object
        Date date = new Date();

        //display time and date using toString()
        System.out.println("Using toString(): " + date.toString());

        //date formatting using SimpleDateFormat
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Using SimpleDateFormat: " + ft.format(dNow));

        //date format using printf
        String str = String.format("Using printf: %tc", date);
        System.out.printf(str);
        System.out.printf("\nUsing printf: %1$s %2$tB %2$td, %2$tY", "Due date:", date);



    }
}
