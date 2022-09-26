package com.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamesh p\\eclipse-workspace\\MySelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");

		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("niranjan.kam11@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("Kamesh@30");
		List<WebElement> loginClick = driver.findElements(By.tagName("button"));

		// System.out.println(loginClick.size());

		for (WebElement Click : loginClick) {

			if (Click.getText().contains("Log in")) {

				Click.click();

				break;
			}

			String title = "STORE";

			if (driver.getTitle().equals(title)) {

				System.out.println("Your are in Home Page");
			} else {
				System.out.println("Please cheek your Code");
			}

		}

	}

}
