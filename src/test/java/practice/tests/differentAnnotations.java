package practice.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class differentAnnotations {
    @Test
    public void TestOne(){
        System.out.println("this is test one!!!");

    }


    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("This is before method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class method");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
    }
}
