package com.examplecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickUpDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamesh p\\eclipse-workspace\\MySelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		String year = "2022";
		String month = "December";
		String date = "15";

		driver.findElement(By.xpath("//img[@class='imgdp']")).click();

		while (true) {

			String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String[] sp = monthyear.split(" ");

			String mon = sp[0];
			String yer = sp[1];

			if (mon.equalsIgnoreCase(month) && yer.equals(year)) {

				break;
			} else

				driver.findElement(By.xpath("//span[text()='Next']")).click();

		}

		List<WebElement> alldate = driver.findElements(By.xpath("//a[@class='ui-state-default']"));

		for (WebElement da : alldate) {

			String tx = da.getText();

			if (tx.equals(date)) {
				da.click();
				break;
			}

		}

	}

}
