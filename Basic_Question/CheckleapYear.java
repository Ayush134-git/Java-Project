package Basic_Question;

public class CheckleapYear {

    public static void main(String[] args) {
        int startYear = 2000;
        int endYear = 2022;
        int leapYearDays = 366;
        int leapYears = countLeapYears(startYear, endYear);
        System.out.println("Number of leap years between " + startYear + " and " + endYear + " is " + leapYears);

        int totalLeapYearDays = leapYearDays * leapYears;
        System.out.println("Total leap year days " + totalLeapYearDays);

    }

    public static int countLeapYears(int startYear, int endYear) {
        int count = 0;
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }
}
