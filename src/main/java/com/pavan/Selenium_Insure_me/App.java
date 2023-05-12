package com.pavan.Selenium_Insure_me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Insure-me application Test
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException 
    {
    	//System.setProperty("webdriver.chrome.driver","E:\\LatestChromeDriver");
    	
    	WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
        System.out.println( "Selenium test scripts executed started ...." );
        
        
        System.out.println("Opening Insure-Me Browser");
        driver.get("http://13.232.238.53:8090/");
        Thread.sleep(2000);
        
        System.out.println("Hitting Contact-US button");
        driver.findElement(By.className("nav-link")).click();
        Thread.sleep(2000);
        
        System.out.println("Entering Name");
        driver.findElement(By.id("inputName")).sendKeys("pavan kasiboina");
        Thread.sleep(1500);
        
        System.out.println("Entering Mobile Number");
        driver.findElement(By.id("inputNumber")).sendKeys("7896834783");
        Thread.sleep(1000);
        
        System.out.println("Entering Email");
        driver.findElement(By.id("inputMail")).sendKeys("pavank@gmail.com");
        Thread.sleep(1000);
        
        System.out.println("Entering Message");
        driver.findElement(By.id("inputMessage")).sendKeys("I need more information regarding this policy");
        Thread.sleep(1000);
        
        System.out.println("Hitting Send Button");
        driver.findElement(By.id("my-button")).click();
        Thread.sleep(1000);
        Thread.sleep(5000);
        
        driver.quit();
        System.out.println("Scripts executed successfully");
        
        
    }
}
