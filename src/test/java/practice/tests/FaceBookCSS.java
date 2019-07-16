package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookCSS {

    WebDriver driver;
    @BeforeMethod
    public void test(){
        driver =  new ChromeDriver();
        driver.get("https://facebook.com");

    }
    @Test
    public void test2(){
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("gfhj");
    }
}
