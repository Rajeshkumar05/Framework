package com.artifactid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoforMaven {
	
	@Test
	public void testHello()
	{
		//ha
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raselvam\\Downloads\\selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	/*
	 * public void response() {
	 * 
	 * Response res=RestAssured.get(); res.getStatusCode();
	 * 
	 * }
	 */
}
