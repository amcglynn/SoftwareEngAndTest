package ie.gmit.softwareeng.week3;

import ie.gmit.softwareeng.week3.MyService;
import ie.gmit.softwareeng.week3.SlowUnreliableDependency;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnreliableTests {

    @Test
    public void testMakeRequest() {
        SlowUnreliableDependency dependency = new SlowUnreliableDependency();
        MyService service = new MyService(dependency);
        String response = service.makeRequest();
        assertEquals("Received success", response);
    }
}
