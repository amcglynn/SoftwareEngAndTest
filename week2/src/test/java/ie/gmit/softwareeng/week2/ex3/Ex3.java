package ie.gmit.softwareeng.week2.ex3;

import org.junit.Test;

import java.util.Arrays;

public class Ex3 {

    @Test(expected = InvalidRequestException.class)
    public void testInvalidFirstNameNull() {
        Request request = new Request(null, "McBain");
        new RequestValidator().validate(request);
    }

    @Test(expected = InvalidRequestException.class)
    public void testInvalidFirstNameEmptyString() {
        Request request = new Request("", "McBain");
        new RequestValidator().validate(request);
    }


    @Test(expected = InvalidRequestException.class)
    public void testInvalidFirstNameSizeString() {
        Request request = new Request("", "McBain");
        new RequestValidator().validate(request);
    }

    @Test(expected = InvalidRequestException.class)
    public void testInvalidFirstNameInvalidCharacters() {
        Request request = new Request("12345", "McBain");
        new RequestValidator().validate(request);
    }

    @Test(expected = InvalidRequestException.class)
    public void testInvalidFirstNameTooLong() {
        char[] charArray = new char[101];
        Arrays.fill(charArray, 'a');
        String firstName = new String(charArray);

        Request request = new Request(firstName, "McBain");
        new RequestValidator().validate(request);
    }

    @Test
    public void testValidRequestDoesNotThrowAnException() {
        Request request = new Request("Hank", "Scorpio");
        new RequestValidator().validate(request);
    }
}
