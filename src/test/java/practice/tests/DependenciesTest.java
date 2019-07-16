package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {

    WebDriver driver= new ChromeDriver();


    @Test(priority = 1)
    public void logIn(){
        driver.get("https://amazon.com");
        System.out.println("Log in");




    }
    @Test(dependsOnMethods = "logIn")
    public void buySmth(){

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.id("ap_email")).sendKeys("tairovmirshod@yahoo.com");
        driver.findElement(By.id("ap_password")).sendKeys("password123"+Keys.ENTER);
        System.out.println("buy buy baby");

    }
    @Test(priority = 3)
    public void homePage(){
        System.out.println("Home Page");

    }
}
