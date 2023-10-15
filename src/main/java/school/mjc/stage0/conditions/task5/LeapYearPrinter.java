package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String leap = ((year%1000%100%10) % 4) != 0 ? "not leap" : "leap";
        System.out.println(leap);
    }
}
