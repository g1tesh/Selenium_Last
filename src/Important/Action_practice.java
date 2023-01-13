package Important;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		action.contextClick(rightclick);
		
		
		action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		action.doubleClick(driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"))).build().perform();
		
		 alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		

	}

}
