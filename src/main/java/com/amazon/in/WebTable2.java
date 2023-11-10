package com.amazon.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		System.setProperty("weebdriver.chrome.driver", "C:\\Users\\manis\\eclipse-workspace_Java_Project\\SampleProject\\driver\\chrome_proxy.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']"));
		List<WebElement> trows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			List<WebElement> tdata = trows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tdata.size(); j++) {
				String Dessert = tdata.get(0).getText();
				if (Dessert.equals("Gingerbread")) {
					
					String Carbs = tdata.get(3).getText();
					System.out.println("Carbs percentage: "+Carbs);
					break;
				}
				
			}
			
		}
		
		}
	

}
