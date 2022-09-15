package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Links count......"+links.size());
		
		List<WebElement> imges=driver.findElements(By.tagName("img"));
		System.out.println("image count......"+imges.size());
		
		
		
	}

}
