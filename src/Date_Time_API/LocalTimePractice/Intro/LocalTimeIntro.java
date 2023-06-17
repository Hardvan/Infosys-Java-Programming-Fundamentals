package Date_Time_API.LocalTimePractice.Intro;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        // Current time
        LocalTime startTime = LocalTime.now();

        // Adding 1 second
        LocalTime endTime = startTime.plusSeconds(1);

        // Looping until the endTime is reached
        while (true) {
            LocalTime current = LocalTime.now();
            int second = current.getSecond();           // Getting the seconds components
            if (second == endTime.getSecond()) {
                System.out.println("Over");
                break;
            } else {
                System.out.println("Loop is running");
            }
        }
    }
}
