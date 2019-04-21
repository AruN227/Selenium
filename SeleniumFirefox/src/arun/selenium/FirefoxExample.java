package arun.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("ak@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("akdejd");
		driver.findElement(By.linkText("Forgotten account?")).click();
	}

}
