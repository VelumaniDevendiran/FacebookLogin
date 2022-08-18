package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Velumani Devendiran\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement d = driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(s, d).perform();
		
	//	WebElement s1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		//WebElement d1 = driver.findElement(By.xpath(""));
		
		//actions.dragAndDrop(s1, d1);
		
		WebElement s2 = driver.findElement(By.xpath("//a[text()=' LOAN ']"));
		
		WebElement d2 = driver.findElement(By.id("LOAN "));
		
		actions.dragAndDrop(s2, d2);
		
		
	}
	
	
}
