package com.tutorialninja.Browserfactory;

import com.tutorialninja.propertyreader.Propertyreader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ManageBrowser {

    public static WebDriver driver;

    String baseURL = Propertyreader.getInstance().getProperty("baseURL");


    int implicitWait = Integer.parseInt(Propertyreader.getInstance().getProperty("implicitWait"));

    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        driver.get(baseURL);
    }

    public void closeBrowser(){
        if(driver != null){
            driver.quit();
        }
    }


}
