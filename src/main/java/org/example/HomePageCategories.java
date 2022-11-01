package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories
{
    public static WebDriver driver;

    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        String a1 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).getText();
        System.out.println("First Category:\t"  + a1);
        String a2 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a")).getText();
        System.out.println("Second Category:\t" + a2);
        String a3 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a")).getText();
        System.out.println("Third Category:\t"  + a3);
        String a4 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a")).getText();
        System.out.println("Fourth Category:\t" + a4);
        String a5 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a")).getText();
        System.out.println("Fifth Category:\t"  + a5);
        String a6 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).getText();
        System.out.println("Sixth Category:\t"  + a6);
        String a7 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a")).getText();
        System.out.println("Seventh Category:\t" + a7);

        driver.quit();

    }
}
