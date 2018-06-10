package com.MVN.SampleProject;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstChromeTest {

    @Test
    public void startWebDriver(){


        /* The following code is for the Chrome Driver
           You also need to download the ChromeDriver executable
           https://sites.google.com/a/chromium.org/chromedriver/
         */
        // String currentDir = System.getProperty("user.dir");
        // String chromeDriverLocation = currentDir + "/tools/chromedriver/chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
		String exePath = "C:\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://seleniumsimplified.com");
        
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Selenium Simplified - Automated Browser Testing With Selenium WebDriver Made Simple"));
        driver.close();
        driver.quit();
    }
}
