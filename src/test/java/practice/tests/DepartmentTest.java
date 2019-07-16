package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DepartmentTest {
    WebDriver driver;
    Select list;

    @BeforeClass
    public void step1() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void testDefaultMethod() {
        WebElement All = driver.findElement(By.id("searchDropdownBox"));
        All.click();
        list = new Select(All);
        String slelectedOption = list.getFirstSelectedOption().getText();
        System.out.println("slelectedOption = " + slelectedOption);
        //Assert.assertEquals("All", slelectedOption);


    }

    @Test(priority = 1)
    public void SortAlphabetical() {
        for(int i =0; i<list.getOptions().size()-1; i++){
            String current=list.getOptions().get(i).getText();
            String next= list.getOptions().get(i+1).getText();
            System.out.println("comparing: "+current+" with "+next);
            Assert.assertTrue(current.compareTo(next)<=0);


        }


//        for(WebElement option: list.getOptions()){
//            System.out.println("option = " + option.getText());
//
//        }



    }
    @Test(priority = 2)
    public void mainDepartmentsTest() throws InterruptedException {
        driver.findElement(By.cssSelector("i.hm-icon.nav-sprite")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/gp/site-directory?ref_=nav_em_T1_0_2_2_36__fullstore']")).click();
        List<WebElement> mainDepts = driver.findElements(By.cssSelector("h2.fsdDeptTitle"));
        for(WebElement opy:mainDepts){
            System.out.println(opy.getText());
        }


    }



}
