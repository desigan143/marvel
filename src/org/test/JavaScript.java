package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
	
		
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		WebElement txtusername=driver.findElement(By.id("email"));
		Js.executeScript("arguments[0].setAttribute('value','manoj')", txtusername);
		WebElement txtpassword=driver.findElement(By.id("pass"));
		Js.executeScript("arguments[1].setAttribute('value','737374')",txtusername, txtpassword);
		
		Object obj=Js.executeScript("return arguments[0].getAttribute('value')", txtusername);
		System.out.println(obj);
		System.out.println(obj.toString());
		String s=(String)obj;
		System.out.println(s);
		
		String S1=(String)Js.executeScript("return arguments[0].getAttribute('value')", txtpassword);
		System.out.println(S1);
		
		
		Js.executeScript("Window.ScrollBy(0,1000");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
