package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitEmail {
    public static void main(String[] args)throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        WebElement input = driver.findElement(By.id("email"));
        input.sendKeys("mirshod.tairov@gmail.com");
        Thread.sleep(2000);
        input.submit();

        String expected = "Your e-mail's been sent!";
        String actual = driver.findElement(By.id("content")).getText();
        if (actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }











    }
}
