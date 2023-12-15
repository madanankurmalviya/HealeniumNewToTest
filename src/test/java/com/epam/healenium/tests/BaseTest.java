package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.BrowserType;
import com.epam.healenium.constants.DriverType;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.settings.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.HashMap;


public class BaseTest {
    static protected WebDriver driver;
    static protected HashMap<PagesType, FrameworkPage> pages;
    public static void main (String []args) throws MalformedURLException {

            driver = new DriverContext(DriverType.LOCAL).getDriver(BrowserType.CHROME);

            driver.manage().window().setSize(new Dimension(1200, 800));

//            pages = new FrameworkContext(FrameworkType.SELENIUM, driver).setFramework();
        driver.get("https://www.google.com");
         driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Hello");
         driver.findElement(By.xpath("//a[text()='About']")).click();
         driver.quit();

    }

}
