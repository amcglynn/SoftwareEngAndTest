package ie.gmit.softwareeng;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise2 {

    @Test
    public void testAdd() {
        List<String> list = new ArrayList<>();
        list.add("1");
        assertEquals("1", list.get(0));
    }

    @Test
    public void testRemove() {
        List<String> list = new ArrayList<>();
        list.add("1");
        assertEquals(1, list.size());
        list.remove("1");
        assertEquals(0, list.size());
    }

    @Test
    public void testIndexOf() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        assertEquals(0, list.indexOf("Hello"));
        assertEquals(1, list.indexOf("World"));
        assertEquals(-1, list.indexOf("String that is not in list"));
    }

    @Test
    public void testContains() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        assertTrue(list.contains("Hello"));
        assertFalse(list.contains("String that is not in the list"));
    }

    @Test
    public void testIsEmpty() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        assertFalse(list.isEmpty());
        list.remove("hello");
        assertTrue(list.isEmpty());
    }

    @Test
    public void testSize() {
        List<String> list = new ArrayList<>();
        assertEquals(0, list.size());
        list.add("hello");
        assertEquals(1, list.size());
    }
}
