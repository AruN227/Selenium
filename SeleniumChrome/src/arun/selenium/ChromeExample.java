package arun.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//URL in the browser
		driver.get("http://facebook.com");
		
		//Identify element by id
		driver.findElement(By.id("email")).sendKeys("ak@gmail.com");
		
		//identify Element by cssSelector
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("akdejd");
		
		//identify element by xpath traverse from parent
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
		
		//close the driver
		driver.close();
	}

}
