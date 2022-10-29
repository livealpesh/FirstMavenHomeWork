package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productes
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
         driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.get("https://demo.nopcommerce.com/");
         driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click();
         driver.findElement(By.xpath("//ul[@class='sublist']/li[1]/a")).click();
         String a1 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]//h2/a")).getText();
         String a2 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]//h2/a")).getText();
         String a3 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[3]//h2/a")).getText();
         driver.quit();

        System.out.println("Product Item No:1\t" + a1);
        System.out.println("Product Item No:2\t" + a2);
        System.out.println("Product Item No:3\t" + a3);

    }

}
