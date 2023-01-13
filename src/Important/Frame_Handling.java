package Important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		System.out.println("here");
		System.out.println(driver.findElement(By.xpath("//iframe[@srcdoc = '<p>Child Iframe</p>']")).getAttribute("srcdoc"));
		//System.out.println(driver.findElement(By.xpath("//iframe[@id = 'frame1']")).getAttribute("src"));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc = '<p>Child Iframe</p>']")));
		System.out.println("here1");
		//System.out.println(driver.findElement(By.xpath("//iframe[@srcdoc = '<p>Child Iframe</p>']")).getAttribute("srcdoc"));
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//section[@id = 'RightSide_Advertisement']")).isDisplayed());
		
		System.out.println("quitting");

	}

}
