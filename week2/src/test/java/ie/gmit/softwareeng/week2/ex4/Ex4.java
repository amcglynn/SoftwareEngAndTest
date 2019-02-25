package ie.gmit.softwareeng.week2.ex4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex4 {

    @Test
    public void testReverseWordsInAString() {
        String reversed = MyUtility.reverseWordsInString("Hello from GMIT");
        assertEquals("GMIT from Hello", reversed);
    }

    @Test
    public void testSingleWordString() {
        String reversed = MyUtility.reverseWordsInString("Hello");
        assertEquals("Hello", reversed);
    }

    @Test
    public void testWordsAreNotReversedWhenThereIsNoSpace() {
        String reversed = MyUtility.reverseWordsInString("Hello;World");
        assertEquals("Hello;World", reversed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullString() {
        MyUtility.reverseWordsInString(null);
    }

    @Test
    public void testEmptyString() {
        String reversed = MyUtility.reverseWordsInString("");
        assertEquals("", reversed);
    }

    @Test
    public void testWhiteSpaceString() {
        String reversed = MyUtility.reverseWordsInString("   ");
        assertEquals("   ", reversed);
    }
}
