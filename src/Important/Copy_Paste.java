package Important;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		WebElement text1 = driver.findElement(By.xpath("//textarea[@name = 'text1']"));
		text1.clear();
		
		text1.sendKeys("Hello");
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		WebElement text2 = driver.findElement(By.xpath("//textarea[@name = 'text2']"));
		
		
		action.sendKeys(Keys.TAB);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
