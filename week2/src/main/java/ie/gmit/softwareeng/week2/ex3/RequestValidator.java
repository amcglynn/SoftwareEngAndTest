package ie.gmit.softwareeng.week2.ex3;

public class RequestValidator {

    public void validate(Request request) {
        validateName(request.getFirstName());
        validateName(request.getLastName());
    }

    private void validateName(String name) {
        if (name == null) {
            throw new InvalidRequestException("Name cannot be null");
        }

        if (name.length() < 1 || name.length() > 100) {
            throw new InvalidRequestException("invalid name length");
        }

        if (!name.matches("[A-Za-z]+")) {
            throw new InvalidRequestException("name must contain only characters");
        }
    }
}
