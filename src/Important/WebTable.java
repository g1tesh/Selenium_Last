package Important;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/capitals-of-the-world.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//No. of rows and colomns

		//String country = "Angola";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country for which you want capital : ");
		String country = sc.next();
		int counter = 0;
				
				List<WebElement> countrylistTable1 = driver.findElements(By.xpath("//table[1][@class ='two-column td-red']//td[1]"));
				
				System.out.println(countrylistTable1.size());
				List<WebElement> countrylistTable2 = driver.findElements(By.xpath("//table[2][@class ='two-column td-red']//td[1]"));
				System.out.println(countrylistTable2.size());
				
				for(int i = 1; i<countrylistTable1.size(); i++)
				{
			
					
					if(countrylistTable1.get(i).getText().equals(country))
					{
						counter = i+1; 
						try {
							WebElement capital = driver.findElement(By.xpath("//table[1][@class ='two-column td-red']//tr["+counter+"]//td[2]"));
							System.out.println("The Captial of givem Country is "+capital.getText());
							
							}
						catch(Exception e)
						{
							System.out.println("Not found in table 1"+ e.getStackTrace());
						}
					}
					else
					{
						System.out.println("break");
						break;
					}
						
						
				}
				
				for(int j = 1; j<countrylistTable2.size(); j++)
				{

					if(countrylistTable2.get(j).getText().equals(country))
					{
						counter = j+1;
						WebElement capital = driver.findElement(By.xpath("//table[2][@class ='two-column td-red']//tr["+counter+"]//td[2]"));
						System.out.println("The Captial of givem Country is "+capital.getText());
						
					}
					else
					{
						System.out.println("Country is not present");
						break;
					}
				}
				
		
		driver.quit();
		

	}

}