package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){
      //  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
		
		System.out.println("Launching Headless Browser");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setHeadless(true);

		driver = new ChromeDriver(opt);
      //driver = new ChromeDriver();
    }

    public static void navigateToHome(){

        System.out.println("URL Launched");
		
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public static void closeDriver(){

        driver.quit();
        System.out.println("Headless Browser closed");
		
    }


}
