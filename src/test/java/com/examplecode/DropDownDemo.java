package com.examplecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamesh p\\eclipse-workspace\\MySelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://aquabottesting.com/dropdowns.html");
		driver.manage().window().maximize();

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[@class='hdropbtn']"))).build().perform();
		
		Thread.sleep(5000);
		List<WebElement> linktex = driver.findElements(By.xpath("//div[@class='hdropdown-content']//a"));

		for (WebElement link : linktex) {

			System.out.println(link.getText());
			
			if(link.getText().contentEquals("Link 4")) {
				
				link.click();
			}
		}

	}

}
