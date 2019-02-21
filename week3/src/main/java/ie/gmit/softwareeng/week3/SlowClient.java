package ie.gmit.softwareeng.week3;

public class SlowClient {

    public void doSomethingSlow() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Interrupted from completing sleep");
        }
    }
}
