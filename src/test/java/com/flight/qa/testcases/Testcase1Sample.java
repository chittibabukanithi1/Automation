package com.flight.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1Sample {
	
	WebDriver driver;

	@Test(priority=1)
	public void LaunchBrowser() {

		System.out.println("Begininig of the Program...............");
		System.setProperty("Webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


	}
	@Test (priority=2)
	public void Loginpage() throws InterruptedException {
		driver.get("https://www.in.cheapflights.com/");

		//Login page//
		//source station entry
		driver.findElement(By.xpath("//input[@aria-label='Flight origin input']")).sendKeys("Visakhapatnam");
		Thread.sleep(7000);
		//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='yWDF yWDF-mod-spacing-base']")).click();

		//Destination Station entry
		driver.findElement(By.xpath("//input[@aria-label='Flight destination input']")).sendKeys("chennai");
		Thread.sleep(3000);
		//	driver.findElement(By.xpath("//input[@class='PVIO-input']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='presentation']")).click();
		Thread.sleep(5000);

		//Travel Journey DAte
		driver.findElement(By.xpath("(//span[@class='sR_k-date'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@aria-label='Monday 20 March, 2023'])")).click();
		driver.findElement(By.xpath("(//div[@aria-label='Monday 20 March, 2023'])")).click();
		Thread.sleep(8000);

		//Return Journey Date
		driver.findElement(By.xpath("//span[@aria-label='End date calendar input']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@aria-label='Thursday 30 March, 2023'])[1]")).click();
		driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
		Thread.sleep(8000);
		
		driver.quit();
	}
}
