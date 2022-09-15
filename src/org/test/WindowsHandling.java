package org.test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowsHandling {
	private static final By driver = null;





	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement btnclose=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		btnclose.click();
		
		WebElement txtsearch=driver.findElement(By.xpath("//input[@name='q']"));
		txtsearch.sendKeys("iphone",Keys.ENTER);
		
		WebElement iphone=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Green, 64 GB)']"));
		iphone.click();
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
	Set<String>allId =driver.getWindowHandles();
	  for (String eachId : allId) {
		  if (!parentId.equals(eachId)) {
			  driver.switchTo().window(eachId);
			
		  }
	  }
		WebElement btncart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	      btncart.click();
	  WebElement btnhelp= driver.findElement(By.xpath("(//a[@class='_3hfHKJ'])[1]"));
	  btnhelp.click();
	  
	// String parenId1= driver.getWindowHandle();
//	 System.out.println(parenId1);
	// Set<String>allId1 =driver.getWindowHandles();
//	  for (String eachId : allId1) {
	//	  if (!parenId1.equals(eachId)) {
	//		  driver.switchTo().window(eachId);
			
	//	  }
	//  }
	  
	 List<String> li=new LinkedList<String>();
	 
	li.addAll(allId);
			 
	 
	 
	  
	 WebElement btnview= driver.findElement(By.xpath("//span[text()='View More']"));
	 btnview.click();
	      
		
	
	}





}

