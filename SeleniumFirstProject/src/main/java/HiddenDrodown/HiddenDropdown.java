package HiddenDrodown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(7000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		List<WebElement> items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='oleBil']")));
		//List<WebElement> items =driver.findElements(By.xpath("//div[contains(class,'_2VHNef')]"));
		
		WebElement iphone = driver.findElement(By.xpath("//a[@class='oleBil']"));
		Thread.sleep(5000);
		System.out.println(items.size());
		for (WebElement item : items) {
			System.out.println(item.getText());
			if (item.equals(iphone))
					{
				iphone.click();
					}
		}

	}

}
