package arun.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//div[@class='fsw_inner ']/div[1]/label")).click();
		
		driver.findElement(By.xpath("//div[@role='combobox']/input")).clear();
		driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys("MUM");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys(Keys.ENTER);
		
		
		WebElement destination = driver.findElement(By.xpath("//div[@class='fsw_inner ']/div[2]/div/div/div/div/input"));
		destination.clear();
		destination.sendKeys("che");
		Thread.sleep(2000);
		
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		

		driver.close();
		
	}

}
