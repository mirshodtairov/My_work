package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxes {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");



        WebElement Monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));


        if(!Monday.isSelected()){
            Monday.click();
        }

        System.out.println(Monday.isSelected());

//        System.out.println(  Monday.isSelected());
//        Monday.click();
//        System.out.println(  Monday.isSelected());
//        Monday.click();
//        System.out.println(  Monday.isSelected());




    }

}
