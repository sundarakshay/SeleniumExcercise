package com.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ForTest {

	  @Test
	  public void f1() {
		  try
		  {
			WebDriver driver;
		    driver = new ChromeDriver();
		    String baseURL = "https://katalon-demo-cura.herokuapp.com/";
		    driver.get(baseURL);
		    driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		    driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		    driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		    driver.findElement(By.id("btn-login")).click();
		    WebElement faciltiy = driver.findElement(By.id("combo_facility"));
		    Select selectFacility ;
		    selectFacility = new Select(faciltiy);
		    selectFacility.selectByValue("Hongkong CURA Healthcare Center");
		    driver.findElement(By.className("checkbox-inline")).click();
		    driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();
		    driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("31/10/2024");
		    driver.findElement(By.xpath("//input[@id='txt_visit_date']")).submit();
		    driver.findElement(By.id("txt_comment")).sendKeys("Please book appointment for the Suresh Doctor of Ortho Department");
		    driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
		    String actualText = driver.findElement(By.tagName("h2")).getText();
		    System.out.println("\n\n"+actualText);
		    String expectedText ="Appoasdasdaintment Confirmationss";
		    //Assert.assertEquals(actualText, expectedText);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e); 
		  }
	  }
	}

