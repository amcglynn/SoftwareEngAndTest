package ie.gmit.softwareeng;

import java.util.Base64;
import java.util.UUID;

public class Validator {
    public boolean isValid(String value) {
        if (value == null) {
            return false;
        }

        try {
            String decoded = new String(Base64.getDecoder().decode(value.getBytes()));
            String[] tokens = decoded.split(":");

            if (tokens.length != 2) {
                return false;
            }

            UUID.fromString(tokens[0]);
            UUID.fromString(tokens[1]);
        } catch (IllegalArgumentException e) {
            // this exception is thrown if the input string is not base64 encoded or if either of the tokens are not
            // valid UUIDs.
            return false;
        }

        return true;
    }
}
