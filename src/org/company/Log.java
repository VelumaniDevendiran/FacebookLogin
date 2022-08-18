package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Log {
	
	
	private void login() {
		System.out.println("Welcome to facebook");
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Velumani Devendiran\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(course).perform();
		
		WebElement Bigdata = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
		Bigdata.click();
	
//		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		
//		actions.moveToElement(oracle).perform();
	}
	
}
