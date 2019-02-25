package ie.gmit.softwareeng.week2.ex1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ex1 {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }
    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }

    @Test
    public void test1() {
        System.out.println("test1 running...");
    }

    @Test
    public void test2() {
        System.out.println("test2 running...");
    }

    @Test
    public void test3() {
        System.out.println("test3 running...");
    }
}
