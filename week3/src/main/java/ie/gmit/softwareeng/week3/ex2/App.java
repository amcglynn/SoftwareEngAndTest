package ie.gmit.softwareeng.week3.ex2;

public class App {

    public static void main(String[] args) {
        SlowUnreliableDependency dependency = new SlowUnreliableDependency();
        Service service = new Service(dependency);

        while(true) {
            System.out.println("Running...");
            System.out.println("Response from service: " + service.makeRequest());
        }
    }
}
