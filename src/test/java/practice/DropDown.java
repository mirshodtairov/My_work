package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/dropdown");



        WebElement selsectElement = driver.findElement(By.id("dropdown"));

        Select list = new Select(selsectElement);
//        String selectedOption = list.getFirstSelectedOption().getText();
//        System.out.println(selectedOption);


        //1. by visble text
        List<WebElement> options= list.getOptions();
        System.out.println("option size "+options.size());
        for(WebElement option:options){
            System.out.println(option.getText());


        }
        //2. by visible attribute
        list.selectByVisibleText("Option 2");
        System.out.println("Selected option :  " +
                " "+list.getFirstSelectedOption().getText());

        list.selectByIndex(2);

        //3. select by value
        list.selectByValue("1");
        System.out.println("Selected option: "+list.getFirstSelectedOption().getText());













    }
}
