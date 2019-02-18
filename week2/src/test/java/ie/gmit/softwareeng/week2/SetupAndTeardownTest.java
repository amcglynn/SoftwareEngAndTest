package ie.gmit.softwareeng.week2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SetupAndTeardownTest {

    @BeforeClass
    public static void setup() {
        System.out.println("Do some once off initialization");
    }

    @Before
    public void beforeTest() {
        System.out.println("Running before test");
    }

    @After
    public void afterTest() {
        System.out.println("Cleaning up after test");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Perform some once off clean up");
    }

    @Test
    public void test1() {
        System.out.println("Running test 1");
    }

    @Test
    public void test2() {
        System.out.println("Running test 2");
    }
}
