package com.amazon.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class employee {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\eclipse-workspace_Java_Project\\SampleProject\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> tableheading = table.findElements(By.cssSelector("thead tr"));
		String text = tableheading.get(0).getText();
		System.out.println(text);
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> tabledata = allrows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tabledata.size(); j++) {
				String text2 = tabledata.get(0).getText();
				if (text2.equals("Yashwanth")) {
				WebElement checkbox = tabledata.get(2).findElement(By.xpath("(//table)[2]/tbody/tr"));
				String text3 = checkbox.getText();
				System.out.println(text3);
				break;
				}
				
			}
		}
	}

}
