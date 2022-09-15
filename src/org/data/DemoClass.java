package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.server.handler.SendKeys;

public class DemoClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Desigan");
		WebElement password =driver.findElement(By.name("pass"));
		password.sendKeys("45678903");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		
	}

}
