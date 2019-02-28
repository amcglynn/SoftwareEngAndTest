package ie.gmit.softwareeng.week3.ex2;

public class Service {

    private SlowUnreliableDependency dependency;

    public Service(SlowUnreliableDependency dependency) {
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
