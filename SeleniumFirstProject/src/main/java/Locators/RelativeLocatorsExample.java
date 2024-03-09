package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement firstName = driver.findElement(By.id("namef"));
		firstName.clear();
		firstName.sendKeys("Sagabala");
		String name = firstName.getAttribute("value");
		System.out.println(name);
		driver.quit();

	}

}
