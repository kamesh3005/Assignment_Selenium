package com.examplecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickUpDropDown2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamesh p\\eclipse-workspace\\MySelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='form-control is-datepick']")).click();

		Select month_drp = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month_drp.selectByVisibleText("March");
		Select year_drp = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		year_drp.selectByVisibleText("2012");

		String date = "10";

		List<WebElement> dateall = driver.findElements(By.xpath("//div[@class='datepick-month']//td"));

		for (WebElement da : dateall) {

			String d = da.getText();
			if (d.equals(date)) {
				da.click();
			}

		}

	}

}
