package Date_Time_API.LocalDateTimePractice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Intro {
    public static void main(String[] args) {
        System.out.println("*****LocalDate*****");

        // Create an object with system date
        LocalDate registrationDate = LocalDate.now();
        System.out.println("Today's date(System date): " + registrationDate);

        // Adding 3 days to the registration date
        LocalDate lastDate = registrationDate.plusDays(3);
        System.out.println("Adding 3 days: " + lastDate);

        // Checking whether current date is before the last date
        if (LocalDate.now().isBefore(lastDate)) {
            System.out.println("Please take the assessment as soon as possible.");
        }
        System.out.println();


        System.out.println("*****LocalTime*****");
        // Create an object with system time
        LocalTime startTime = LocalTime.now();
        // The time being returned here is according to the region/locale/zone in which the application is hosted.
        System.out.println("Start Time: " + startTime);
        // Adding 1 hour
        LocalTime endTime = startTime.plusHours(1);
        // The time being returned here is according to the region/locale/zone in which the application is hosted.
        System.out.println("End Time: " + endTime);

        // Getting the hours, minutes and seconds components
        LocalTime current = LocalTime.now();
        int hour = current.getHour();
        int minute = current.getMinute();
        int second = current.getSecond();
        System.out.println("Hour: " + hour + " Minute: " + minute + " Second: " + second);
        System.out.println();


        System.out.println("*****LocalDateTime*****");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);
        // Subtracting 3 days and output time is in ETC
        System.out.println("Subtracting 3 days: " + dateTime.minusDays(3));
    }
}
