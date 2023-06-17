package Date_Time_API.LocalDatePractice.AgeFinder;

import java.time.LocalDate;

public class AgeFinder {

    public static int getAge(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();

        int age = currentDate.getYear() - dateOfBirth.getYear();

        // If the current month is less than the month of birth, then the age is reduced by 1
        if (currentDate.getMonthValue() < dateOfBirth.getMonthValue())
            age--;
            // If the current month is equal to the month of birth, then we check the day
        else if (currentDate.getMonthValue() == dateOfBirth.getMonthValue())
            // If the current day is less than the day of birth, then the age is reduced by 1
            if (currentDate.getDayOfMonth() < dateOfBirth.getDayOfMonth())
                age--;

        return age;
    }

    public static LocalDate getDateAfterNDays(int noOfDays) {
        return LocalDate.now().plusDays(noOfDays);
    }

    public static LocalDate getDateAfterXYearYmonthZDays(int year, int month, int days) {
        return LocalDate.now().plusYears(year).plusMonths(month).plusDays(days);
    }

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1989, 10, 26);

        System.out.println("Age: " + getAge(dateOfBirth));
        System.out.println("Date after 15 days: " + getDateAfterNDays(15));
        System.out.println("Date after 1 year 2 months 3 days: " +
                getDateAfterXYearYmonthZDays(1, 2, 3));
    }
}
