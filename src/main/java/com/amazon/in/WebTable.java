package com.amazon.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("weebdriver.chrome.driver", "C:\\Users\\manis\\eclipse-workspace_Java_Project\\SampleProject\\driver\\chrome_proxy.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.xpath("//table[@id='simpletable']"));
		
		List<WebElement> trows = table.findElements(By.xpath("//table[@id='simpletable']//tbody/tr"));
	        for(int i=0;i<trows.size();i++)
	        {
	        	List<WebElement> tdata = trows.get(i).findElements(By.tagName("td"));
	        
	       for (int j = 0; j < tdata.size(); j++) {
	        		String Name = tdata.get(0).getText();
	        		System.out.println(Name);
	        		if (Name.equals("Koushik")) {
	        			WebElement checkbox = tdata.get(3).findElement(By.tagName("input"));
	        			checkbox.click();
	        			break;
						
					}
						
					}
					
					
				}
	        	
		
			
		
	        	
	        }
	       // driver.quit();
	
	
}
