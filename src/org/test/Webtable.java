package org.test;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Desigan D\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> table= driver.findElements(By.tagName("table"));
		System.out.println("table size......"+table.size());
		
		WebElement table1=driver.findElement(By.id("customers"));
		
		System.out.println("-----All values from table----");
		             String  text= table1.getText();
		             System.out.println(text);
		             
		             System.out.println("----All values from table----row wise---");
		           List<WebElement>tablerows=  table1.findElements(By.tagName("tr"));
		             for (int i = 0; i < tablerows.size(); i++) {
		            	 WebElement eachrow=tablerows.get(i);
		            	 System.out.println(eachrow.getText());
		            	 
		            	 System.out.println("------only Heading-----");
		            	List<WebElement> tableHeads= table1.findElements(By.tagName("th"));
		            	for (WebElement eachHead : tableHeads) {
		            		System.out.println(eachHead.getText());
		            		
		            		
		            		System.out.println("---only Heading---Row Wise------");
		            		for (int i1 = 0; i1 < tablerows.size(); i1++) {
		            			WebElement eachrow1=tablerows.get(i1);
		            			List<WebElement> tableHead=eachrow1.findElements(By.tagName("th"));
		            		   
								for (int j = 0; j < tableHeads.size(); j++) {
								WebElement eachHead1=tableHeads.get(j);
								System.out.println(eachHead1.getText());
								
							}
									
								}
		            			
									
								}
		            			
								
		             }
		            	
							
						
		            	 
		            	 
		            	 
	}				
}				
		          
		             
	


