package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		//driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button")).click();
		//String message = driver.findElement(By.id("message")).getText();
		//System.out.println(message);
		//driver.close();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");

	}

}
