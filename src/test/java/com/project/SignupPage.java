package com.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamesh p\\eclipse-workspace\\MySelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");

		driver.manage().window().maximize();
		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.id("sign-username")).sendKeys("niranjan.kam11@gmail.com");
		driver.findElement(By.id("sign-password")).sendKeys("Kamesh@30");
		List<WebElement> butt = driver.findElements(By.tagName("button"));

		for (WebElement b : butt) {
			if (b.getText().equals("Sign up")) {
				b.click();
			}
		}

	}

}
