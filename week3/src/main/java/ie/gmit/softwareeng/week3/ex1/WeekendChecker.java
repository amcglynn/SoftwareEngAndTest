package ie.gmit.softwareeng.week3.ex1;

public class WeekendChecker {

    private final DayOfTheWeek dayOfTheWeek;

    public WeekendChecker(DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String isWeekend() {
        String today = dayOfTheWeek.getDay();

        if ("SATURDAY".equals(today) || "SUNDAY".equals(today)) {
            return "It's the weekend!";
        } else {
            return "It's not the weekend yet";
        }
    }
}
