package ie.gmit.softwareeng.week3.ex2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnreliableTests {

    @Test
    public void testMakeRequest() {
        SlowUnreliableDependency dependency = new SlowUnreliableDependency();
        Service service = new Service(dependency);
        String response = service.makeRequest();
        assertEquals("Received success", response);
    }
}
