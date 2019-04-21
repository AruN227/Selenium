package arun.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		int i=1;
		while(i<8) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		driver.close();
	}

}
