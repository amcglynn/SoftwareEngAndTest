package ie.gmit.softwareeng.week2.ex3;

public class Request {
    private String firstName;
    private String lastName;

    public Request(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
