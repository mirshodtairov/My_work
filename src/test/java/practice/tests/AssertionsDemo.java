package practice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionsDemo {


    @Test
    public void test1(){
        String a= "A";
        String b = "AAA";

        Assert.assertTrue(b.substring(0,1).contains(a));

    }
    @Test
    public void test2(){
        String a= "V";
        String b = "V";

        Assert.assertEquals(a,b);

    }

    @Test
    public void test3() {
       boolean b = 1==2;
       Assert.assertTrue(b);

    }
    @Test
    public void test4(){
        String a = "AAA";
        String b = "BBB";

        Assert.assertTrue(b.contains(a));
    }
    @Test
    public void test5(){
        Assert.assertTrue(false);
    }



}
