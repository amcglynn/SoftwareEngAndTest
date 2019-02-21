package ie.gmit.softwareeng.week3;

public class SlowUnreliableDependency {
    public String getStatus() {
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.err.println("Slow dependency wait interrupted");
        }

        int x = (int)(Math.random() * 4);

        if (x == 1) {
            throw new CommunicationException();
        } else if (x == 2) {
            return null;
        } else if (x == 3) {
            return "Failure";
        }

        return "Success";
    }

}

