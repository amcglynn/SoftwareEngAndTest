package ie.gmit.softwareeng.week2.ex2;

public class EndlessTask {

    public void run() {
        while(true) {
            try {
                System.out.println("Running endless task");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Endless task was interrupted");
            }
        }
    }
}
