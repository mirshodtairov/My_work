package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        String searchItem = "charger";


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem + Keys.ENTER);

        String actualSearchedItem = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

        if (searchItem.equals(actualSearchedItem)) {
            System.out.println("PASS");
        } else {
            System.out.println("Fail");
            System.out.println("actualSearchedItem = " + actualSearchedItem);
            System.out.println("search Item = " + searchItem);

        }

    }
}
