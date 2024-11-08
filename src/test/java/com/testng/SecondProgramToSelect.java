package com.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SecondProgramToSelect {

	  @Test
	  public void f1() {

		/*try
		{
		WebDriver driver;
		Boolean flag;
		Select selectVariable;
		driver = new ChromeDriver();
		String baseUrl = "https://blazedemo.com/";
		driver.get(baseUrl);
		WebElement destination =driver.findElement(By.xpath("//select[@name='fromPort']"));
		selectVariable = new Select(destination);
		selectVariable.selectByValue("Boston");
		selectVariable = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		selectVariable.selectByValue("London");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[1]")).click();
		driver.findElement(By.id("inputName")).sendKeys("Akshay Sundar");
		driver.findElement(By.id("address")).sendKeys("201");
		driver.findElement(By.id("city")).sendKeys("Houston");
		driver.findElement(By.id("state")).sendKeys("Texas");
		driver.findElement(By.id("zipCode")).sendKeys("123456");
		WebElement card = driver.findElement(By.xpath("//select[@name='cardType']"));
		selectVariable = new Select(card);
		selectVariable.selectByValue("amex");
		driver.findElement(By.id("creditCardNumber")).sendKeys("12345678912");
		driver.findElement(By.id("creditCardMonth")).clear();
		driver.findElement(By.id("creditCardMonth")).sendKeys("09");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("2022");
		driver.findElement(By.id("nameOnCard")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String header = driver.findElement(By.tagName("h1")).getText();
		if (header.equals("Thank you for your purchase today!"))
		{
			 flag = true;
			 
		}
		else
		{
			flag= false;
		}
		 System.out.println(flag);
	}
		catch(Exception e)
		{
			 System.out.println(e);

		}*/
		WebDriver driver;
		driver = new ChromeDriver();
		String baseUrl = "https://webdriveruniversity.com/Datepicker/index.html";
		driver.get(baseUrl);
		driver.findElement(By.id("datepicker")).click();
	}

}
