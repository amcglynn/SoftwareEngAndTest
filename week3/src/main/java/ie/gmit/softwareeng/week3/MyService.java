package ie.gmit.softwareeng.week3;

public class MyService {

    private SlowUnreliableDependency dependency;

    public MyService(SlowUnreliableDependency dependency) {
        this.dependency = dependency;
    }

    public String makeRequest() {
        String response = dependency.getStatus();

        if (response.toString() == "Success") {
            return "Received success";
        } else {
            return "Could not complete successfully";
        }
    }
}
