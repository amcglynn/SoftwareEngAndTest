package ie.gmit.softwareeng.week3;

import ie.gmit.softwareeng.week3.MyService;
import ie.gmit.softwareeng.week3.SlowUnreliableDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ReliableTests {

    @Mock
    private SlowUnreliableDependency mockDependency;

    @Test
    public void testSuccess() {
        when(mockDependency.getStatus()).thenReturn("Success");
        MyService service = new MyService(mockDependency);
        String response = service.makeRequest();
        assertEquals("Received success", response);
    }
}
