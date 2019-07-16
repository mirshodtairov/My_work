package practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        WebElement firstname = driver.findElement(By.name("firstname"));
        Faker fName = new Faker();
        String s = fName.name().firstName();
        firstname.sendKeys(s);

        Faker fLastName = new Faker();
        String s2 = fLastName.name().lastName();
        driver.findElement(By.xpath("//*[@id=\"u_0_g\"]")).sendKeys(s2);

        String s3="8506677517";
        driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys(s3);

        driver.findElement(By.name("reg_passwd__")).sendKeys("Password123@");


       WebElement month =  driver.findElement(By.xpath("//*[@id=\"month\"]"));

       Select jan = new Select(month);
       jan.selectByValue("1");

       WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
       Select formday= new Select(day);
       formday.selectByValue("25");

       WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));

       Select chooseFromYear = new Select(year);
       chooseFromYear.selectByValue("1988");

       WebElement male = driver.findElement(By.xpath("//*[@id=\"u_0_9\"]"));
       male.click();

       driver.findElement(By.name("websubmit")).click();






    }
}