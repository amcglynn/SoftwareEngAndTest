package week2;

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
