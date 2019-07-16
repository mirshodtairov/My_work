package practice.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MixedAnnotation {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        System.out.println("Setting up browser");

    }

    @BeforeMethod
    public void beforeClasses() {
        System.out.println("Opening a browser");
        System.out.println("go to website and log in");
        //driver.manage().window().maximize();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void TestOne() {
        System.out.println("Testing !!!!!!");
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);


    }


    @AfterMethod
    public void AfterMethod() {
        System.out.println("log out");
        System.out.println("closing browser");
        driver.quit();

    }

    @AfterClass
    public void afterClass() {
        System.out.println("reporting");

    }
}
