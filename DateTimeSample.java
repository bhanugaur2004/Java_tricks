import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
//import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.*;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeSample {
    public static void main(String[] args) throws ParseException {
        System.out.println("=======Bad Practice Dates=======");
        showBadPracticeDate();
        System.out.println("\n=======Good Practice Dates=======");
        showGoodPracticeDate();
        System.out.println("\n=======Good Practice Time=======");
        showGoodPracticeTime();
    }

    private static void showBadPracticeDate() throws ParseException {
        // outdated api before java 8
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2023, Calendar.OCTOBER, 22);
        Date firstDate = gregorianCalendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(firstDate));

        Date secondDate = simpleDateFormat.parse("09 May 2022");
        gregorianCalendar.setTime(secondDate);
        System.out.println("Day of month: " + gregorianCalendar.get(Calendar.DAY_OF_MONTH));
    }

    private static void showGoodPracticeDate() {
        // modern api since java 8
        LocalDate firstDate = LocalDate.of(2023, Month.OCTOBER, 22);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
        System.out.println(formatter.format(firstDate));

        LocalDate secondDate = LocalDate.parse("09 May 2022", formatter);
        System.out.println("Day of month: " + secondDate.getDayOfMonth());
    }

    private static void showGoodPracticeTime() {
        // UTC
        Instant nowUtc = Instant.now();
        System.out.println("Time now in UTC: " + nowUtc);

        // local time
        ZonedDateTime nowLocalTimeZone = ZonedDateTime.now();
        System.out.println("Time now in local time zone: " + nowLocalTimeZone);

        // time in new york
        ZonedDateTime nowNewYork = ZonedDateTime.now(TimeZone.getTimeZone("America/New_York").toZoneId());
        System.out.println("Time now in New York: " + nowNewYork);
    }
}
