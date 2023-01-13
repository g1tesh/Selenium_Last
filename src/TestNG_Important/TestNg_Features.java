package TestNG_Important;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNg_Features {
	
	WebDriver driver;
	XLSUtility utility;
	
	@BeforeTest
	@Parameters({"url"})
	public void setup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();    //multiple browser
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
		driver.findElement(By.id("login")).click();
	}
	
	@Test(priority = 1, enabled = true,groups = {"Sanity","Regression"})
	@Parameters({"text"})
	public void TestLoginFailed() throws InterruptedException
	{
		driver.findElement(By.id("userName")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Talent_123");
		driver.findElement(By.id("login")).click();
		String logintest = driver.findElement(By.xpath("//p[@id = 'name']")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(logintest, "Invalid username or password!");
	}
	@Test(priority = 3 ,dataProvider = "logindata")
	public void xlslogin(String email, String pwd)
	{
		System.out.println("In login Test");
		driver.findElement(By.id("userName")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		System.out.println("clicked login");
	}
	
	@DataProvider(name = "logindata")
	public String[][] getxlsData() throws IOException
	{
		utility = new XLSUtility();
		int getrowcount = utility.GetRowCount(".\\TestData\\Login_Data.xlsx");
		int getcolscount = utility.GetColcount(".\\TestData\\Login_Data.xlsx");
		String data[][] = new String[getrowcount][getcolscount];
		for(int i = 1; i<=getrowcount; i++)
		{
			for(int j = 0; j<getcolscount; j++)
			{
				data[i-1][j] = utility.GetData(i, j, ".\\TestData\\Login_Data.xlsx");

			}
		}
		return data;
	}
	@Test(priority = 2 ,enabled = true,groups= {"Regression"})
	@Parameters({"username", "password"})
	public void LoginPass(String uname, String Pass) throws InterruptedException
	{
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys(uname);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Pass);
		driver.findElement(By.id("login")).click();
		boolean loginvalue = driver.findElement(By.xpath("//label[text() = 'gpatil@asda.com']")).isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3, groups = {"Sanity"})
	public void group3()
	{
		System.out.println("Group3");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
