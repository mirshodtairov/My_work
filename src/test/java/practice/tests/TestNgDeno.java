package practice.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDeno {

    @Test
    public void test1(){

        System.out.println("this is test 1");


    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is Before method");
    }


    @Test
    public void test2(){

        System.out.println("this is test 2");


    }
}

