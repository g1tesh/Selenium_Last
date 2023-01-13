package Important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_search {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		WebElement search = driver.findElement(By.xpath("//div[@jsname = 'vdLsw']"));
		js.executeScript("arguments[0].click()",search );
		
		
		List <WebElement> suggestions = driver.findElements(By.xpath("//ul[@jsname = 'bw4e9b']//li"));
		
		for(int i = 0; i<suggestions.size(); i++)
		{
			System.out.println("Suggestions are "+suggestions.get(i).getText());
		}

	}

}
