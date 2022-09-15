package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrreenshot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		WebElement txtusername=driver.findElement(By.id("email"));
		txtusername.sendKeys("Desigan");
		
		File src=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		
		File des=new File("C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\facebook\\facebook.png");
		
		FileUtils.copyFile(src, des);
		
		
	}

}
