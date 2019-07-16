package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class amazonDropdownPractice {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        element.click();
        Select list = new Select(element);
        list.selectByVisibleText("Video Games");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("call of duty"+Keys.ENTER);






























//        WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));
//
//
//        Select fromList = new Select(dropdownElement);
//
//
//        fromList.selectByVisibleText("Books");
//
//        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
//
//
//
//        //dropdownElement.click();
//
//
//       //Select list = new Select(dropdownElement);
////        list.selectByVisibleText("Option 2");


    }
}
