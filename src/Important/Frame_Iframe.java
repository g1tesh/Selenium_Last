package Important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("Alert")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		
		System.out.println(driver.findElement(By.linkText("org.openqa.selenium")).isDisplayed());
		
		
	}

}
