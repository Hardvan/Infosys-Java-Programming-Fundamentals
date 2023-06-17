package Date_Time_API.LocalDatePractice.Intro;

import java.time.LocalDate;

public class IntroDateTime {
    public static void main(String[] args) {
        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Yesterday
        LocalDate yesterday = date.minusDays(1);
        System.out.println("Yesterday: " + yesterday);

        // Tomorrow
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);
    }
}
