package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VyTrackLogOutTestNadirClass {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String act = "http://qa3.vytrack.com/user/login";

        if (url.equals(act)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("url = " + url);
            System.out.println("act = " + act);


        }
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput")).sendKeys("user4");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.id("_submit"));
        submit.click();

        Thread.sleep(3000);


        driver.findElement(By.className("dropdown-toggle")).click();
        Thread.sleep(2000);

        WebElement logout = driver.findElement(By.xpath("//*[@id=\"user-menu\"]/ul/li[4]/a"));
        logout.click();
        Thread.sleep(3000);
        driver.quit();


    }


}
