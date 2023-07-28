package com_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class login_pae extends Base_pg{
	
    
	static By From = By.xpath("//input[@id='fromPlaceName']");
	static By From_d = By.xpath("(//span[text()='TELANGANA'])[1]");	
	static By to = By.xpath("//input[@id='toPlaceName']");
	static By to_d = By.xpath("//a[@id=\"ui-id-13\"]//span[text()='VIJAYAWADA']");
	static By depart = By.xpath("//input[@id='txtJourneyDate']");
	static By depart_D = By.xpath("(//table[@class='ui-datepicker-calendar']//a[text()='31'])[1]");
	static By checkBut = By.xpath("//input[@id='searchBtn']");


    
	public static WebElement from_T()
	{
		return driver.findElement(From);		
	}

	// from drop action
	public static WebElement from_Td()
	{
		return driver.findElement(From_d);		
	}

	public static WebElement to_T()
	{
		return driver.findElement(to);		
	}

	// to drop 
	public static WebElement to_Td() throws InterruptedException
	{
		Thread.sleep(6000);
		return driver.findElement(to_d);		
	}

	public static WebElement depart_T()
	{
		return driver.findElement(depart);		
	}

	// date 
	public static WebElement depart_Td()
	{
		return driver.findElement(depart_D);

	}
	public static WebElement checkBut_T()
	{
		return driver.findElement(checkBut);	
	}


	//action	
	
	

	public static void From_T()
	{
		from_T().sendKeys("hyderabad");
		Actions act = new Actions(driver);
		act.moveToElement(from_Td()).perform();
		from_Td().click();
	}

	public static void To_T() throws InterruptedException
	{
		to_T().sendKeys("vijayawada");
		Actions act = new Actions(driver);
		act.moveToElement( to_Td()).perform();
		to_Td().click();
	}
	
	

	public static void depart_date()
	{
		depart_T().click();				
	}
	
	public static void Depart_Date_select()
	{
		depart_Td().click();
	}

	public static void checkAvailability()
	{
		checkBut_T().click();
	}

}
