package Important;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("//input[@class = 'hasDatepicker']")).click();
		
//		WebElement mon= driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']"));
//						
//		WebElement Yr = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']"));
		
		
		while(true)
		{
			String CurrentMonth =  driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
			System.out.println(CurrentMonth);
			String CurrentYear = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
			System.out.println(CurrentYear);
			
			if(CurrentMonth.equals("July") && CurrentYear.equals("1991"))
			{
				break;
			}
			else
			{
				System.out.println("here");
				driver.findElement(By.xpath("//span[text() = 'Prev']")).click();
			}
			
			
			
		}
		

	}

}
