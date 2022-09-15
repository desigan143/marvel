package org.data;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement drdmulti=driver.findElement(By.id("multi-select"));
		Select s=new Select(drdmulti);
		s.selectByIndex(3);
		s.selectByIndex(5);
		s.selectByValue("Florida");
		s.selectByVisibleText("New Jersey");
		
		System.out.println("-----get all options----");
		List<WebElement>options=s.getOptions();
		System.out.println("options size-----"+options.size());
		for (int i = 0; i < options.size(); i++) {
			WebElement eachoption=options.get(i);
			System.out.println(eachoption.getText());
			
			System.out.println("Get all selected option----");
			List<WebElement> allselect =s.getAllSelectedOptions();
			for (WebElement eachselect : allselect) {
				System.out.println(eachselect.getText());
				
				System.out.println("----get first selected options----");
				WebElement first= s.getFirstSelectedOption();
				System.out.println(first.getText());
				
				s.deselectByIndex(5);
				
				
				for (int i1 = 0; i1 < options.size(); i1++) {
					s.selectByIndex(i1);
					Thread.sleep(3000);
					
					
					s.deselectAll();
					
				}
				
			
					
				}
				
				
				
				
			}
			
				
			
			
		}
	}

