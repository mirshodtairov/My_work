package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VytruckTitleTesr {

    WebDriver driver;

    @BeforeMethod
    public void test1() {
        driver = new ChromeDriver();
        driver.get("http://qa3.vytrack.com");
        driver.manage().window().maximize();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.id("prependedInput")).sendKeys("user4");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.xpath("//*[contains(text(),'My Configuration')]")).click();
        String expected = "John Doe";
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("title = " + title);
        if (title.startsWith(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println(title);
            System.out.println(expected);
        }
    }

    @AfterMethod
    public void Test3() {
        driver.close();
    }

}
