package com.examplecode;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Forms {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamesh p\\eclipse-workspace\\MySelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate commands
		driver.navigate().to("https://aquabottesting.com/index.html#buttons");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		driver.navigate().forward();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		WebElement fname = driver.findElement(By.id("cname"));
		WebElement email = driver.findElement(By.id("cemail"));
		WebElement phoneNo = driver.findElement(By.id("cphone"));

		if (fname.isEnabled() && email.isEnabled() && phoneNo.isEnabled()) {
			fname.sendKeys("Kamesh Pichandi");
			email.sendKeys("kameshkam3094@gmail.com");
			phoneNo.sendKeys("123456789");
		}

		else {

			System.out.println("The Text box is Hidden");
		}

		WebElement cphone = driver.findElement(By.id("cphone-mobile"));

		if (cphone.isEnabled()) {

			cphone.click();
		}

		WebElement message = driver.findElement(By.id("cmessage"));
		message.sendKeys("Welcome to learn Automation");

		WebElement cselect = driver.findElement(By.id("cselect"));

		Select sc = new Select(cselect);
		List<WebElement> options = sc.getOptions();

		for (WebElement op : options) {

			if (op.getText().equals("Testing")) {

				op.click();

				
			}

		}
		driver.findElement(By.id("csuccess")).click();

		String title = "Aquabot Testing Site";

		if (driver.getTitle().equals(title)) {

			System.out.println("The Tile of the Page is :" + title);
		}

		
		List<WebElement> submit = driver.findElements(By.tagName("button"));
		System.out.println("Size :"+submit.size());
		
		for(WebElement su:submit) {
			
			if(su.getText().equals("SUBMIT")) {
				
				su.click();
			}
			
			
		}
		
		WebElement submessage = driver.findElement(By.id("cmsgSubmit"));
		
		
		if(submessage.isDisplayed()) {
			
			System.out.println("Successfully submited the form");
		}
		else {
			
			System.out.println("You have some Error in the form");
		}
		
		org.openqa.selenium.Dimension size = message.getSize();
		
		System.out.println("The Hight of the text box :"+size.getHeight());
		System.out.println("The with of the text box  :"+size.getWidth());
		
	}

}
