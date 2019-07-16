package practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayAssignment {

    WebDriver driver;


    @BeforeMethod
    public void  test1(){
        driver= new ChromeDriver();
        driver.get("https://ebay.com");
        driver.manage().window().maximize();
    }

    @Test
    public void  test2() throws InterruptedException {
        String item="wooden spoon";
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(item+Keys.ENTER);
        String result = driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println(result);
        driver.findElement(By.partialLinkText("All")).click();
        String resultAterAll = driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println(resultAterAll);
        result=result.replace(",", "").replace(" ","").replace("results","");
        int r1=Integer.parseInt(result);
        System.out.println("Result after searching item "+r1);
        resultAterAll=resultAterAll.replace(",", "").replace(" ","").replace("results","");
        int r2=Integer.parseInt(resultAterAll);
        System.out.println("Result after expanding ALL "+r2);


        driver.navigate().back();
        String text = driver.findElement(By.id("gh-ac")).getAttribute("value");
        Assert.assertEquals(text,item);
        driver.navigate().back();
        Thread.sleep(2000);
        String text2 = driver.findElement(By.id("gh-ac")).getAttribute("value");
        if(text2.length()==0){
            System.out.println("Pass");
        }else{
            System.out.println("FAIL");
            System.out.println(text2);
        }

    }
    @AfterMethod
    public void test3(){
        driver.close();
    }

}
