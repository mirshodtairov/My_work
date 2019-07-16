package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriaigsListTest {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://washingtondc.craigslist.org");
        driver.manage().window().maximize();
        WebElement find = driver.findElement(By.partialLinkText("electro"));
        find.click();
        WebElement checkOnHasImage= driver.findElement(By.name("hasPic"));
        checkOnHasImage.click();
        WebElement miles = driver.findElement(By.name("search_distance"));
        miles.sendKeys("3");
        driver.findElement(By.name("postal")).sendKeys("22061");
        driver.findElement(By.name("min_price")).sendKeys("20");
        driver.findElement(By.name("max_proice")).sendKeys("40");



    }
}
