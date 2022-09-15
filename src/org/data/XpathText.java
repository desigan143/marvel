package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		WebElement btncreate = driver.findElement(By.xpath("//a[text()='create a page']"));
		//btncreate.click();
		String text=btncreate.getText();
		System.out.println(text);
		WebElement txtcreate =driver.findElement(By.xpath("//div[text()='for a celebrity, band or business']"));
	           String text2=txtcreate.getText();
	           System.out.println(text2);
	           
	          WebElement txtfacebook= driver.findElement(By.xpath("//h2[contains(text(),'facebook']"));
	         String text3=  txtfacebook.getText();
	         System.out.println(text3);
	        WebElement txtusername= driver.findElement(By.xpath("//input[contains(@id,'em')]"));
	           txtusername.sendKeys("Desigan");
		  WebElement txtpassword= driver.findElement(By.xpath("//input[contains(@id,'pa')]"));
		  txtpassword.sendKeys("64468785");
		  
		    String atuser=  txtusername.getAttribute("Desigan");
		    System.out.println(atuser);
		    
		   String atpass= txtpassword.getAttribute("786544");
		   System.out.println(atpass);
		  
	}

}
