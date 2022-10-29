package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BasePage
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();

        // timstamp for not change every time email or anything else for same data applicable

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Alpesh");
        driver.findElement(By.id("LastName")).sendKeys("Panchal");
        driver.findElement(By.id("Email")).sendKeys("alpeshpan" + timeStamp + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("alpeshpan123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("alpeshpan123");

//   i am not able to registration successfull massege while i am using locator type Class

        driver.findElement(By.id("register-button")).click();

        String regMsg = driver.findElement(By.className("result")). getText();
        System.out.println(regMsg);

// what happen when use locator as a xpath i did not get answer

//        driver.findElement(By.xpath("//div[@class="form-fields" ]/div[5]/input [@id="Email"]")).sendKeys("alpeshpanchal123@gmail.com");

        // home work we need use this one befor push into git for closing the browser

         driver.quit();
//        driver.close();
    }


}
