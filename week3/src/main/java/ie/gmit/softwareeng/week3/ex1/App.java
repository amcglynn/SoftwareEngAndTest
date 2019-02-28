package ie.gmit.softwareeng.week3.ex1;

public class App {

    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        WeekendChecker weekendChecker = new WeekendChecker(dayOfTheWeek);
        System.out.println(weekendChecker.isWeekend());
        System.out.println("Today is " + dayOfTheWeek.getDay());
    }
}
