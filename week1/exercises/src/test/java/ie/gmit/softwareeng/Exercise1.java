package ie.gmit.softwareeng;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class Exercise1 {

    /***
     * Exercise 1.b
     */
    @Test
    public void testObjectIsNotNull() {
        assertNotNull(new Object());
    }

    /***
     * Exercise 1.c
     */
    @Test
    public void testLengthOfString() {
        String str = "hi";
        assertEquals(2, str.length());
    }

    /***
     * Exercise 1.d
     */
    @Test
    public void testEmptyList() {
        List<Object> list = Arrays.asList();
        assertTrue(list.isEmpty());
    }
}
