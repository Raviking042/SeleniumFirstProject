package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.findElement(By.id("my-text-id")).sendKeys("Ravindra");
		
		driver.findElement(By.name("my-textarea")).sendKeys("Working on Selenium");
		
		
		driver.findElement(By.cssSelector(".btn.btn-outline-primary.mt-3")).click();
		
		
		

	}

}
