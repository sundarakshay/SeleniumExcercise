package com.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProgramToOpenBrowser {

	  @Test
	  public void f1() {		
		try
		{
		WebDriver driver;
        driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        driver.findElement(By.xpath("//a[@id='item_1_title_link']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Sundar");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Sundar");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("07120");
        driver.findElement(By.name("continue")).click(); 
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        String text =driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
        System.out.println(text);
        if (text.equals("Thank you for your order!"))
        {
        	System.out.println("True");
        }
        else
        {
        	System.out.println("False");
       	
        }
        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();

		}
		catch(Exception e)
		{
        	System.out.println(e);

		}
        
	}

}
