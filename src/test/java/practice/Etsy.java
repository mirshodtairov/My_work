package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Etsy {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://etsy.com");



        WebElement element = driver.findElement(By.xpath("//body[@class='transitional-widebg-white guest  no-touch is-responsive en-US USD US is-global-nav']"));
        element.click();





//        WebElement value = driver.findElement(By.id("search-query"));
//        value.sendKeys("wooden spoon");
//
//        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
//        submit.click();
//
//        <button class="btn btn-primary" type="submit" value="Search" aria-label="Search">
//                Search
//                </button>

    }
}
