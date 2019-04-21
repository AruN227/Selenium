package arun.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExample {
	public static void main(String[] args) {
		
		//set property
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//URL in the browser
		driver.get("http://facebook.com");
		
		//identify element by id
		driver.findElement(By.id("email")).sendKeys("ak@gmail.com");
		
		//identify element by name
		driver.findElement(By.name("pass")).sendKeys("akdejd");
		
		//identify element by text
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.close();
	}

}
