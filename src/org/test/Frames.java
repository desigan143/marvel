package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> Frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Frames size------"+Frames.size());
		
	//	driver.switchTo().frame("frame1");
		 
		WebElement fr = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(fr);
	 
	     WebElement txtbox= driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("Desigan");
		
		driver.switchTo().frame("frame3");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		
		WebElement dropdown=driver.findElement(By.id("animals"));
		Select s=new Select(dropdown);
		s.selectByIndex(3);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		 
		WebElement txtbox1 =driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("deva");
		
		
		
		
	
}

}
