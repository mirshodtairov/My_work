package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CSSDemo {
    WebDriver driver;
    @BeforeMethod
    public void test(){
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://etsy.com");
       driver.manage().window().maximize();

    }

    @Test
    public void testetsy(){

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Wooden Spoon"+ Keys.ENTER);
        driver.findElement(By.cssSelector("#global-enhancements-search-query")).click();


    }
}
