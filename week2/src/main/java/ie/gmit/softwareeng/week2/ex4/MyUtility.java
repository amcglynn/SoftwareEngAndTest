package ie.gmit.softwareeng.week2.ex4;

public class MyUtility {
    public static String reverseWordsInString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        String[] tokens = input.split(" ");

        if (tokens.length == 0) {
            return input;
        }

        String result = "";

        for (int i = tokens.length - 1; i >= 0; i--) {
            result += tokens[i] + " ";
        }
        return result.trim();
    }
}
