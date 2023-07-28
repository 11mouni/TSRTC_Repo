package com_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_pg {
	public static WebDriver driver;
    
	public static void openurl()
	{	
		driver= new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	public static void driver_close()
	{
		driver.quit();
	}


}
