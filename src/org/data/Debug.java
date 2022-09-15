package org.data;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		       WebElement btncreate= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		          btncreate.click();
		          Thread.sleep(5000);
		         WebElement txtfirstname=  driver.findElement(By.name("firstname"));
		         txtfirstname.sendKeys("Desigan");
		        WebElement txtlastname= driver.findElement(By.name("lastname"));
		        txtlastname.sendKeys("Devanathan");
		       WebElement txtemail= driver.findElement(By.name("reg_email__"));
		       txtemail.sendKeys("Desigan");
		       WebElement txtpassword=driver.findElement(By.name("reg_passwd__"));
		       txtpassword.sendKeys("3768753");
		       WebElement txtclick=driver.findElement(By.name("websubmit"));
		       txtclick.click();
		        
	}	 
		

	}
