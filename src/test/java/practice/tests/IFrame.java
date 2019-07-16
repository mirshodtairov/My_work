package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrame {


    @Test
    public void test1(){
        WebDriver driver  = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tinymce");
        WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.tagName("body")).sendKeys("Ben Askren loose");
        driver.switchTo().parentFrame();
        driver.findElement(By.linkText("Elemental Selenium")).click();
        
    }
}
