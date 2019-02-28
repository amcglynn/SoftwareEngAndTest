package ie.gmit.softwareeng.week3.ex1;

import java.util.Calendar;

public class DayOfTheWeek {
    private Calendar calendar;
    private String[] daysOfTheWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

    public DayOfTheWeek() {
        calendar = Calendar.getInstance();
    }

    public String getDay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return daysOfTheWeek[dayOfWeek - 1];
    }
}
