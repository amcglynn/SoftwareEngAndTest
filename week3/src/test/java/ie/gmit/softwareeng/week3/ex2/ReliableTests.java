package ie.gmit.softwareeng.week3.ex2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ReliableTests {

    @Mock
    private SlowUnreliableDependency mockDependency;

    @Test
    public void testSuccess() {
        when(mockDependency.getStatus()).thenReturn("Success");
        Service service = new Service(mockDependency);
        String response = service.makeRequest();
        assertEquals("Received success", response);
    }

    @Test
    public void testFailure() {
        when(mockDependency.getStatus()).thenReturn("failure");
        Service service = new Service(mockDependency);
        String response = service.makeRequest();
        assertEquals("Could not complete successfully", response);
    }

    @Test
    public void testServiceDoesNotCrashWhenNullIsReturnedFromDependency() {
        when(mockDependency.getStatus()).thenReturn(null);
        Service service = new Service(mockDependency);
        String response = service.makeRequest();
        assertEquals("Could not complete successfully", response);
    }

    @Test
    public void testServiceDoesNotCrashWhenAnExceptionIsThrowFromDependency() {
        doThrow(new CommunicationException()).when(mockDependency).getStatus();
        Service service = new Service(mockDependency);
        String response = service.makeRequest();
        assertEquals("Could not complete successfully", response);
    }
}
