package practice.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestNG {
     WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://google.com");


    }
    @Test
    public void test1(){
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @AfterMethod
    public void test2(){
        driver.quit();
    }
}
