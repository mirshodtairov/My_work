package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parentChildXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        WebElement d= driver.findElement(By.xpath("//*[@id='dropdown']"));

        Select option = new Select(d);
        option.selectByValue("1");


        WebElement stateSelection = driver.findElement(By.id("state"));
        Select states = new Select(stateSelection);
        states.selectByValue("FL");

        driver.findElement(By.xpath("//*[@id=\"year\"]/value[2017]")).click();

    }
}
