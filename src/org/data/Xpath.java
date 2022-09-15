package org.data;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		  
		WebElement username= driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		username.sendKeys("Desigan");
		
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		password.sendKeys("5328639");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		loginbtn.click();
		
		
		
	}

}
