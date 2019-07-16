package practice.tests;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DifferentAnnotationTools {

    @Test
    public void TestOne(){
        System.out.println("this is test one!!!");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("this is after class method");

    }

    @Test
    public void test2(){
        System.out.println("This is test 2!!!");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method");
    }




}
