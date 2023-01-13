package Important;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_paste_again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.name("text1")).sendKeys("HELLO");
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		action.sendKeys(Keys.TAB).build().perform();
		
		/*
		 * WebElement text2 = driver.findElement(By.name("text2"));
		 * action.moveToElement(text2).build().perform(); text2.click();
		 */
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		

	}

}
