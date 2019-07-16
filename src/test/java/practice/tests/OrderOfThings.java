package practice.tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings {

    @Test(priority = 1)
    public void test1(){
        System.out.println("Executing test 1");
    }
    @Test(priority = 2)
    public void atest2(){
        System.out.println("Executing test 2");
    }
    @Ignore
    @Test(priority = 5+5)
    public void test3(){
        System.out.println("Executing test 3");
    }


}
