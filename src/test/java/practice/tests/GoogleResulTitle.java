package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class GoogleResulTitle {

    WebDriver driver;

    @BeforeMethod
    public void  test1(){
        driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
    }

    @Test
    public void test2() throws InterruptedException {
        WebElement searchBox =driver.findElement(By.name("q"));
        searchBox.click();

        List<String> searchStrs = Arrays.asList("Java", "JUnit", "REST Assured" );
        for(int i=0;i<searchStrs.size();i++){
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys(searchStrs.get(i) + Keys.ENTER);
            String expectedUrl = driver.findElement(By.className("iUh30")).getText();
            Thread.sleep(2000);
            driver.findElement(By.className("TbwUpd")).click();
            Assert.assertTrue(driver.getCurrentUrl().startsWith(expectedUrl));
            System.out.println("PASS");
            driver.navigate().back();



        }




    }
    @AfterMethod
    public void test3(){
        driver.quit();
    }





}
