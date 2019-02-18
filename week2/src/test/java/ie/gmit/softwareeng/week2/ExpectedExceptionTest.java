package ie.gmit.softwareeng.week2;

import org.junit.Test;

import java.util.UUID;

public class ExpectedExceptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionIsThrownWhenUuidFormatIsIncorrect() {
        UUID.fromString("----");
    }
}
