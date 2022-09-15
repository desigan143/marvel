package org.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String Title= driver.getTitle();
		System.out.println("Title");
		
		String url=driver.getCurrentUrl();
		System.out.println("url");
	//	driver.quit();
		
		
	}

}
