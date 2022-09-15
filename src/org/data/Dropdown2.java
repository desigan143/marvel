package org.data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement drdmulti=driver.findElement(By.id("multi-select"));
		Select s=new Select(drdmulti);
		s.selectByIndex(3);
		
		System.out.println("----get all options---");
		List<WebElement> options=s.getOptions();
		System.out.println("options.size-----"+options.size());
		
		for (int i = 0; i < options.size(); i++) {
			WebElement eachoption= options.get(i);
			System.out.println(eachoption.getText());
			
			
				
					
					
				}
				
				
				}
					
				
			
		
		
		
		
			
		
			
		
		
	
		}

