package Important;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("welcome");
		
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("Welcome")).click();
		driver.findElement(By.linkText("Welcome Back, Kotter")).click();
		driver.findElement(By.linkText("Welcome to Wrexham")).click();
		driver.findElement(By.linkText("Welcome to the N.H.K.")).click();
		
		Set<String> Allhandles = driver.getWindowHandles();
		
		List<String> ListHandles = new ArrayList(Allhandles);
		
		for(int i = 0; i<ListHandles.size(); i++)
		{
			String windowid = ListHandles.get(i);
			
			driver.switchTo().window(windowid);
			
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equals("Welcome Back, Kotter - Wikipedia"))
			{
				System.out.println("Do not close this window");
			}
			else
			{
				driver.close();
			}
			
		}
		
		
		
		
		

	}

}
