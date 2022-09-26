package com.examplecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamesh p\\eclipse-workspace\\MySelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://aquabottesting.com/dropdowns.html#");

		driver.manage().window().maximize();

		WebElement toglebut = driver.findElement(By.xpath("//span[@class='slider round']"));

		if (toglebut.isEnabled()) {

			toglebut.click();
		}

		Select sc = new Select(driver.findElement(By.xpath("//select[@id='color-select']")));

		// sc.selectByIndex(3);
		sc.selectByValue("Green");

		// Select Drop Down
		// ------------------

		driver.findElement(By.id("games")).click();

		Select sc1 = new Select(driver.findElement(By.id("react-select")));

		sc1.selectByIndex(5);

		// select by Multiple Drop Down

		WebElement mulselect = driver.findElement(By.xpath("//input[@class='chosen-search-input default']"));
		mulselect.click();

		List<WebElement> allelem = driver.findElements(By.xpath("//ul[@class='chosen-results']//li"));

		for (WebElement ele : allelem) {

			System.out.println(ele.getText());

			if (ele.getText().equals("Raspberry Iced Tea") || ele.getText().equals("Chocolate Milk")
					|| ele.getText().equals("Lemonade")) {
			
				for(int i=0;i<=2;i++) {
					
					ele.click();
				}
				
				

				
				
			}

		}

	}

}
