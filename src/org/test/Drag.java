package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Actions a=new Actions(driver);
	WebElement scrdrag=driver.findElement(By.id("todrag"));
	WebElement desdrop=driver.findElement(By.id("mydropzone"));

	a.clickAndHold(scrdrag).moveToElement(desdrop).build().perform();
	


	
	
				
	}

}
