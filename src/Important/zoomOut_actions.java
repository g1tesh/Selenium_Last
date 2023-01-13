package Important;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomOut_actions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
				
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("document.body.style.zoom = '50%'");
		
		Thread.sleep(2000);
		
	  //driver.findElement(By.xpath("//div[@class = ' css-1wa3eu0-placeholder' and contains(text(),'Select State')]")).click();
		driver.findElement(By.xpath("//div[@class = ' css-1wa3eu0-placeholder' and contains(text(),'Select State')]")).click();
		

	}

}
