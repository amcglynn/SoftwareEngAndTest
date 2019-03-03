package ie.gmit.softwareeng.week3.ex2;

public class Service {

    private SlowUnreliableDependency dependency;

    public Service(SlowUnreliableDependency dependency) {
        this.dependency = dependency;
    }

    public String makeRequest() {
        try {
            String response = dependency.getStatus();

            if ("Success".equals(response)) {
                return "Received success";
            } else {
                return "Could not complete successfully";
            }
        } catch (CommunicationException e) {
            return "Could not complete successfully";
        }
    }
}
