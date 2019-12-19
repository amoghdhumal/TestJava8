package com.cucumber.Selenium4;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class MultiSelect 

{
    public static WebDriver driver ;

    @Test
    public void elementScreenShot()
    {
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://output.jsbin.com/osebed/2");
        WebElement webElement = driver.findElement(By.id("fruits"));
        
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
        fruits.isMultiple();
        fruits.deselectAll();
        
        
        Select select = new Select(driver.findElement(By.id("fruits")));
        List<WebElement> options = select.getOptions();
        options.forEach(option->System.out.println(option.getText()));
        
        File strFile =  webElement.getScreenshotAs(OutputType.FILE);
        //driver.findElement(By.xpath(".//table[@class='dataTable']")).getScreenshotAs(OutputType.FILE);
        System.out.println(strFile);
        driver.quit();
    }
    
    
}
