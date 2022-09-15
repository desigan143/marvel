package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement btncreate=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	     btncreate.click();
	    WebElement drdmonth= driver.findElement(By.id("month"));
	    Select s=new Select(drdmonth);
	    s.selectByIndex(3);
	    s.selectByValue("6");
	    s.selectByVisibleText("Nov");
	
		
		
	}

}
