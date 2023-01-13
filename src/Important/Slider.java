package Important;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {

		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().minimize();
		
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		WebElement slider = driver.findElement(By.className("range-slider__wrap"));
		
		action.dragAndDropBy(slider, 0, 55).build().perform();
		
		

	}

}
