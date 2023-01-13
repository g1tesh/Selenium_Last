package Important;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class Alert_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().deleteAllCookies();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		
		Alert_Handle alerthandle = new Alert_Handle();
		alerthandle.Action1(driver);
		alerthandle.Action2(driver, wait);
		alerthandle.Actions3(driver);
		
	}
	
	public void Action1(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@id = 'alertButton']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
	}
	
	public void Action2(WebDriver driver, WebDriverWait wait)
	{
		driver.findElement(By.id("timerAlertButton")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
	
		
		alert.accept();
		System.out.println("Alert Accepted");
	}
	
	public void Actions3(WebDriver driver)
	{
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Gitesh@gmai.com");
		alert.accept();
		System.out.println("Random string = "+RandomString.make(5));
		
	}
	
}


