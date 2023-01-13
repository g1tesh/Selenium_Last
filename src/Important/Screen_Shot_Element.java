package Important;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot_Element {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement img = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
		File scr = img.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir")+"\\ScreenShot\\img.png");
		FileUtils.copyFile(scr, trg);
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		

	}

}
