package ie.gmit.softwareeng.week2;

import org.junit.Test;

public class TimeOutTest {

    @Test(timeout = 1500)
    public void testTimeOut() {
        SlowClient slowClient = new SlowClient();
        slowClient.doSomethingSlow();
    }
}
