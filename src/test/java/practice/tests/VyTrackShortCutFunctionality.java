package practice.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VyTrackShortCutFunctionality {

    WebDriver driver;
    @BeforeMethod
    public void  test1(){
        driver= new ChromeDriver();
        driver.get("http://qa3.vytrack.com");
        driver.manage().window().maximize();
    }
    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager94");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        String title = driver.getTitle();
        driver.findElement(By.className("fa-share-square")).click();
        driver.findElement(By.linkText("See full list")).click();
        Thread.sleep(1000);
        //driver.findElement(By.cssSelector("#container > div.container-fluid > div > table > tbody > tr:nth-child(21) > td:nth-child(1) > a")).click();
        //driver.manage().window().setPosition(new Point(100,200));
        // driver.manage()

       //op.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)");

       WebElement w= driver.findElement(By.xpath("//*[@id='container']/div[2]/div/table/tbody/tr[21]/td[1]/a"));
       w.click();




    }
}
