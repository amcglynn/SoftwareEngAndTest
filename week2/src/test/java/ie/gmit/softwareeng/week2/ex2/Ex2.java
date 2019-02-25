package ie.gmit.softwareeng.week2.ex2;

import org.junit.Test;

public class Ex2 {

    @Test(timeout = 3000)
    public void detectEndlessLoop() {
        new EndlessTask().run();
    }

}
