package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Navigation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
	//	driver.navigate().to("https:flipkart.com/");
	//	driver.navigate().back();
	//	driver.navigate().forward();
	//	driver.navigate().refresh();
		
		WebElement txtusername=driver.findElement(By.id("email"));
		boolean displayed=txtusername.isDisplayed();
		System.out.println("Displayed--------"+displayed);
		
		WebElement btncreate=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		boolean enabled= btncreate.isEnabled();
		System.out.println("enabled------"+enabled);
		btncreate.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement btnmale=driver.findElement(By.xpath("//input[@type='radio']"));
		btnmale.click();
	
	System.out.println("Before select------"+btnmale.isSelected());
	btnmale.click();
	
	System.out.println("After select------"+btnmale.isSelected());
	}
	

}
