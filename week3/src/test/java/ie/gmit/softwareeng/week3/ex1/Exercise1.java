package ie.gmit.softwareeng.week3.ex1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Exercise1 {

    @Mock
    DayOfTheWeek dayOfTheWeek;

    @Test
    public void testWeekday() {
        when(dayOfTheWeek.getDay()).thenReturn("THURSDAY");

        WeekendChecker weekendChecker = new WeekendChecker(dayOfTheWeek);
        String isWeekend = weekendChecker.isWeekend();

        assertEquals("It's not the weekend yet", isWeekend);
    }

    @Test
    public void testWeekend() {
        when(dayOfTheWeek.getDay()).thenReturn("SATURDAY");

        WeekendChecker weekendChecker = new WeekendChecker(dayOfTheWeek);
        String isWeekend = weekendChecker.isWeekend();

        assertEquals("It's the weekend!", isWeekend);
    }
}
